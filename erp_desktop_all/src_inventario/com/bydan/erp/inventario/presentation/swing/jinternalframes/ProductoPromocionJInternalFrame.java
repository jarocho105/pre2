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
import com.bydan.erp.inventario.util.ProductoPromocionConstantesFunciones;

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
public class ProductoPromocionJInternalFrame extends ProductoPromocionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoPromocion;
	
	protected JMenuBar jmenuBarProductoPromocion;
	
	protected JMenu jmenuProductoPromocion;
	protected JMenu jmenuDatosProductoPromocion;
	protected JMenu jmenuArchivoProductoPromocion;
	protected JMenu jmenuAccionesProductoPromocion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoPromocion;	
	protected GridBagConstraints gridBagConstraintsProductoPromocion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoPromocionDetalleFormJInternalFrame jInternalFrameDetalleFormProductoPromocion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoPromocion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoPromocion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected BodegaBeanSwingJInternalFrame bodegarelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegarelacion="";

	protected ProductoBeanSwingJInternalFrame productorelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productorelacion="";
	
	public ProductoPromocionSessionBean productopromocionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public BodegaSessionBean bodegarelacionSessionBean;
	public ProductoSessionBean productorelacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoPromocion> productopromocions;		
	public List<ProductoPromocion> productopromocionsEliminados;	
	public List<ProductoPromocion> productopromocionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoPromocion;		
	protected JButton jButtonAbrirOrderByProductoPromocion;
	
	
	//protected JPanel jPanelOrderByProductoPromocion;
	//public JScrollPane jScrollPanelOrderByProductoPromocion;	
	//protected JButton jButtonCerrarOrderByProductoPromocion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoPromocionLogic productopromocionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoPromocion;
	public JScrollPane jScrollPanelDatosEdicionProductoPromocion;
	public JScrollPane jScrollPanelDatosGeneralProductoPromocion;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoPromocionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoPromocion;
	//public JScrollPane jScrollPanelImportacionProductoPromocion;
	
	
	
	protected JPanel jPanelAccionesProductoPromocion;
	
    protected JPanel jPanelPaginacionProductoPromocion;
    protected JPanel jPanelParametrosReportesProductoPromocion;
	protected JPanel jPanelParametrosReportesAccionesProductoPromocion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoPromocion;
	protected JPanel jPanelParametrosAuxiliar2ProductoPromocion;
	protected JPanel jPanelParametrosAuxiliar3ProductoPromocion;
	protected JPanel jPanelParametrosAuxiliar4ProductoPromocion;
	//protected JPanel jPanelParametrosAuxiliar5ProductoPromocion;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoPromocion;
	//protected JPanel jPanelImportacionProductoPromocion;
	
	
	public JTable jTableDatosProductoPromocion;
	
	
	
	//public JTable jTableDatosProductoPromocionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoPromocion;
	protected JButton jButtonDuplicarProductoPromocion;
	protected JButton jButtonCopiarProductoPromocion;
	protected JButton jButtonVerFormProductoPromocion;
	protected JButton jButtonNuevoRelacionesProductoPromocion;
	protected JButton jButtonModificarProductoPromocion;
	
    protected JButton jButtonGuardarCambiosTablaProductoPromocion;
	protected JButton jButtonCerrarProductoPromocion;
	
	
	protected JButton jButtonRecargarInformacionProductoPromocion;
	protected JButton jButtonProcesarInformacionProductoPromocion;
	
	
	protected JButton jButtonAnterioresProductoPromocion;
	protected JButton jButtonSiguientesProductoPromocion;
	protected JButton jButtonNuevoGuardarCambiosProductoPromocion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoPromocion;
	//protected JButton jButtonCerrarReporteDinamicoProductoPromocion;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoPromocion;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoPromocion;
	//protected JButton jButtonGenerarImportacionProductoPromocion;
	//protected JButton jButtonCerrarImportacionProductoPromocion;
	//protected JFileChooser jFileChooserImportacionProductoPromocion;
	//protected File fileImportacionProductoPromocion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoPromocion;
	protected JButton jButtonDuplicarToolBarProductoPromocion;
	protected JButton jButtonNuevoRelacionesToolBarProductoPromocion;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoPromocion;
	protected JButton jButtonCopiarToolBarProductoPromocion;
	protected JButton jButtonVerFormToolBarProductoPromocion;
	public JButton jButtonGuardarCambiosTablaToolBarProductoPromocion;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoPromocion;
	protected JButton jButtonCerrarToolBarProductoPromocion;
	
	protected JButton jButtonRecargarInformacionToolBarProductoPromocion;
	protected JButton jButtonProcesarInformacionToolBarProductoPromocion;
	protected JButton jButtonAnterioresToolBarProductoPromocion;
	protected JButton jButtonSiguientesToolBarProductoPromocion;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoPromocion;
	protected JButton jButtonAbrirOrderByToolBarProductoPromocion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoPromocion;
	protected JMenuItem jMenuItemDuplicarProductoPromocion;
	protected JMenuItem jMenuItemNuevoRelacionesProductoPromocion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoPromocion;
	protected JMenuItem jMenuItemCopiarProductoPromocion;
	protected JMenuItem jMenuItemVerFormProductoPromocion;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoPromocion;
	protected JMenuItem jMenuItemCerrarProductoPromocion;
	protected JMenuItem jMenuItemDetalleCerrarProductoPromocion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoPromocion;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoPromocion;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoPromocion;
	protected JMenuItem jMenuItemProcesarInformacionProductoPromocion;
	protected JMenuItem jMenuItemAnterioresProductoPromocion;
	protected JMenuItem jMenuItemSiguientesProductoPromocion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoPromocion;
	protected JMenuItem jMenuItemAbrirOrderByProductoPromocion;
	protected JMenuItem jMenuItemMostrarOcultarProductoPromocion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoPromocion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoPromocion;
	protected JCheckBox jCheckBoxSeleccionadosProductoPromocion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoPromocion;
	protected JCheckBox jCheckBoxConGraficoReporteProductoPromocion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoPromocion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoPromocion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoPromocion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoPromocion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoPromocion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoPromocion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoPromocion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoPromocion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoPromocion;
	protected JTextField jTextFieldValorCampoGeneralProductoPromocion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoPromocion;
	//public JList<Reporte> jListColumnasSelectReporteProductoPromocion;
	//public JScrollPane jScrollColumnasSelectReporteProductoPromocion;
	
	//public JLabel jLabelRelacionesSelectReporteProductoPromocion;
	//public JList<Reporte> jListRelacionesSelectReporteProductoPromocion;
	//public JScrollPane jScrollRelacionesSelectReporteProductoPromocion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoPromocion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoPromocion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoPromocion;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoPromocion;
	
		
	//public JLabel jLabelArchivoImportacionProductoPromocion;	
	//public JLabel jLabelPathArchivoImportacionProductoPromocion;
	//protected JTextField jTextFieldPathArchivoImportacionProductoPromocion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoPromocion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoPromocion;
	
	//public JLabel jLabelColumnaCategoriaValorProductoPromocion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoPromocion;
	
	//public JLabel jLabelColumnasValoresGraficoProductoPromocion;
	//public JList<Reporte> jListColumnasValoresGraficoProductoPromocion;
	//public JScrollPane jScrollColumnasValoresGraficoProductoPromocion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoPromocion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoPromocion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoPromocion;
	public JPanel jPanelFK_IdBodegaProductoPromocion;
	public JButton jButtonFK_IdBodegaProductoPromocion;
	public JPanel jPanelFK_IdBodegaRelacionProductoPromocion;
	public JButton jButtonFK_IdBodegaRelacionProductoPromocion;
	public JPanel jPanelFK_IdProductoProductoPromocion;
	public JButton jButtonFK_IdProductoProductoPromocion;
	public JPanel jPanelFK_IdProductoRelacionProductoPromocion;
	public JButton jButtonFK_IdProductoRelacionProductoPromocion;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoPromocion;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoPromocion;
	public JButton jButtonid_bodegaFK_IdBodegaProductoPromocion= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoPromocionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion;
	public JLabel jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion;
	public JButton jButtonid_bodega_relacionFK_IdBodegaRelacionProductoPromocion= new JButtonMe();
	public JButton jButtonid_bodega_relacionFK_IdBodegaRelacionProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_bodega_relacionFK_IdBodegaRelacionProductoPromocionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoPromocion;
	public JLabel jLabelid_productoFK_IdProductoProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoPromocion;
	public JButton jButtonid_productoFK_IdProductoProductoPromocion= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoPromocionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoPromocion;
	
	public JPanel jPanelid_producto_relacionFK_IdProductoRelacionProductoPromocion;
	public JLabel jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion;
	public JButton jButtonid_producto_relacionFK_IdProductoRelacionProductoPromocion= new JButtonMe();
	public JButton jButtonid_producto_relacionFK_IdProductoRelacionProductoPromocionUpdate= new JButtonMe();
	public JButton jButtonid_producto_relacionFK_IdProductoRelacionProductoPromocionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion;
	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoPromocionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPromocionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPromocionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoPromocionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoPromocion)	{
		this.jButtonRecargarInformacionProductoPromocion = jButtonRecargarInformacionProductoPromocion;
	}
	
	public JButton getjButtonProcesarInformacionProductoPromocion() {
		return this.jButtonProcesarInformacionProductoPromocion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoPromocion)	{
		this.jButtonProcesarInformacionProductoPromocion = jButtonProcesarInformacionProductoPromocion;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoPromocion() {
		return this.jButtonRecargarInformacionProductoPromocion;
	}
	
	
	public List<ProductoPromocion> getproductopromocions() {
		return this.productopromocions;
	}

	public void setproductopromocions(List<ProductoPromocion> productopromocions) {
		this.productopromocions = productopromocions;
	}
	
	public List<ProductoPromocion> getproductopromocionsAux() {
		return this.productopromocionsAux;
	}

	public void setproductopromocionsAux(List<ProductoPromocion> productopromocionsAux) {
		this.productopromocionsAux = productopromocionsAux;
	}
	
	public List<ProductoPromocion> getproductopromocionsEliminados() {
		return this.productopromocionsEliminados;
	}

	public void setProductoPromocionsEliminados(List<ProductoPromocion> productopromocionsEliminados) {
		this.productopromocionsEliminados = productopromocionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoPromocion() {
		return jComboBoxTiposSeleccionarProductoPromocion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoPromocion(
			JComboBox jComboBoxTiposSeleccionarProductoPromocion) {
		this.jComboBoxTiposSeleccionarProductoPromocion = jComboBoxTiposSeleccionarProductoPromocion;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoPromocion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoPromocion() {
		return jTextFieldValorCampoGeneralProductoPromocion;
	}

	public void setjTextFieldValorCampoGeneralProductoPromocion(
			JTextField jTextFieldValorCampoGeneralProductoPromocion) {
		this.jTextFieldValorCampoGeneralProductoPromocion = jTextFieldValorCampoGeneralProductoPromocion;
	}

	public void setBorderResaltarValorCampoGeneralProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoPromocion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoPromocion() {
		return this.jCheckBoxSeleccionarTodosProductoPromocion;
	}

	public void setjCheckBoxSeleccionarTodosProductoPromocion(
			JCheckBox jCheckBoxSeleccionarTodosProductoPromocion) {
		this.jCheckBoxSeleccionarTodosProductoPromocion = jCheckBoxSeleccionarTodosProductoPromocion;
	}

	public void setBorderResaltarSeleccionarTodosProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoPromocion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoPromocion() {
		return this.jCheckBoxSeleccionadosProductoPromocion;
	}

	public void setjCheckBoxSeleccionadosProductoPromocion(
			JCheckBox jCheckBoxSeleccionadosProductoPromocion) {
		this.jCheckBoxSeleccionadosProductoPromocion = jCheckBoxSeleccionadosProductoPromocion;
	}
	
	public void setBorderResaltarSeleccionadosProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoPromocion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoPromocion() {
		return this.jComboBoxTiposArchivosReportesProductoPromocion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoPromocion(
			JComboBox jComboBoxTiposArchivosReportesProductoPromocion) {
		this.jComboBoxTiposArchivosReportesProductoPromocion = jComboBoxTiposArchivosReportesProductoPromocion;
	}

	public void setBorderResaltarTiposArchivosReportesProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoPromocion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoPromocion() {
		return this.jComboBoxTiposReportesProductoPromocion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoPromocion(
			JComboBox jComboBoxTiposReportesProductoPromocion) {
		this.jComboBoxTiposReportesProductoPromocion = jComboBoxTiposReportesProductoPromocion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoPromocion() {
	//	return jComboBoxTiposReportesDinamicoProductoPromocion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoPromocion(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoPromocion) {
	//	this.jComboBoxTiposReportesDinamicoProductoPromocion = jComboBoxTiposReportesDinamicoProductoPromocion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoPromocion() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoPromocion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoPromocion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoPromocion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoPromocion = jComboBoxTiposArchivosReportesDinamicoProductoPromocion;
	//}
	
	public void setBorderResaltarTiposReportesProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoPromocion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoPromocion() {
		return this.jComboBoxTiposGraficosReportesProductoPromocion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoPromocion(
			JComboBox jComboBoxTiposGraficosReportesProductoPromocion) {
		this.jComboBoxTiposGraficosReportesProductoPromocion = jComboBoxTiposGraficosReportesProductoPromocion;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoPromocion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoPromocion() {
		return this.jComboBoxTiposPaginacionProductoPromocion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoPromocion(
			JComboBox jComboBoxTiposPaginacionProductoPromocion) {
		this.jComboBoxTiposPaginacionProductoPromocion = jComboBoxTiposPaginacionProductoPromocion;
	}
	
	public void setBorderResaltarTiposPaginacionProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoPromocion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoPromocion() {
		return this.jComboBoxTiposRelacionesProductoPromocion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoPromocion() {
		return this.jComboBoxTiposAccionesProductoPromocion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoPromocion(
			JComboBox jComboBoxTiposRelacionesProductoPromocion) {
		this.jComboBoxTiposRelacionesProductoPromocion = jComboBoxTiposRelacionesProductoPromocion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoPromocion(
			JComboBox jComboBoxTiposAccionesProductoPromocion) {
		this.jComboBoxTiposAccionesProductoPromocion = jComboBoxTiposAccionesProductoPromocion;
	}
	
	public void setBorderResaltarTiposRelacionesProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoPromocion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoPromocion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoPromocion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoPromocion() {
	//	return jCheckBoxConGraficoDinamicoProductoPromocion;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoPromocion(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoPromocion) {
	//	this.jCheckBoxConGraficoDinamicoProductoPromocion = jCheckBoxConGraficoDinamicoProductoPromocion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoPromocion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoPromocion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoPromocion .setBorder(borderResaltar);		
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
		this.productopromocionSessionBean=new ProductoPromocionSessionBean();
		
		this.productopromocionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productopromocionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productopromocionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoPromocionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoPromocionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoPromocionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoPromocionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoPromocionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Promocion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoPromocionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoPromocion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoPromocion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"nuevo","nuevo","Nuevo"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"duplicar","duplicar","Duplicar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"copiar","copiar","Copiar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"ver_form","ver_form","Ver"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"recargar","recargar","Recargar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoPromocion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoPromocion,this.jTtoolBarProductoPromocion,
							"cerrar","cerrar","Salir"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoPromocion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoPromocion;
			
				this.jButtonProcesarInformacionToolBarProductoPromocion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoPromocion;
				
		//protected JButton jButtonModificarToolBarProductoPromocion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoPromocion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoPromocion=new JMenuMe("General");
		this.jmenuArchivoProductoPromocion=new JMenuMe("Archivo");
		this.jmenuAccionesProductoPromocion=new JMenuMe("Acciones");
		this.jmenuDatosProductoPromocion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoPromocion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoPromocion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoPromocion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoPromocion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoPromocion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoPromocion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoPromocion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoPromocion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoPromocion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoPromocion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoPromocion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoPromocion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoPromocion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoPromocion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoPromocion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoPromocion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoPromocion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoPromocion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoPromocion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoPromocion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoPromocion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoPromocion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoPromocion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoPromocion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoPromocion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoPromocion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoPromocion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoPromocion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoPromocion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoPromocion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoPromocion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoPromocion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoPromocion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoPromocion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoPromocion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoPromocion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoPromocion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoPromocion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoPromocion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoPromocion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoPromocion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoPromocion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoPromocion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoPromocion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoPromocion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoPromocion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoPromocion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoPromocion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoPromocion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoPromocion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoPromocion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoPromocion.add(this.jMenuItemCerrarProductoPromocion);
			
			this.jmenuAccionesProductoPromocion.add(this.jMenuItemNuevoProductoPromocion);
			this.jmenuAccionesProductoPromocion.add(this.jMenuItemNuevoGuardarCambiosProductoPromocion);
			this.jmenuAccionesProductoPromocion.add(this.jMenuItemNuevoRelacionesProductoPromocion);
			this.jmenuAccionesProductoPromocion.add(this.jMenuItemGuardarCambiosTablaProductoPromocion);		
			this.jmenuAccionesProductoPromocion.add(this.jMenuItemDuplicarProductoPromocion);		
			this.jmenuAccionesProductoPromocion.add(this.jMenuItemCopiarProductoPromocion);		
			this.jmenuAccionesProductoPromocion.add(this.jMenuItemVerFormProductoPromocion);		
			
			this.jmenuDatosProductoPromocion.add(this.jMenuItemRecargarInformacionProductoPromocion);				
			this.jmenuDatosProductoPromocion.add(this.jMenuItemAnterioresProductoPromocion);				
			this.jmenuDatosProductoPromocion.add(this.jMenuItemSiguientesProductoPromocion);				
			this.jmenuDatosProductoPromocion.add(this.jMenuItemAbrirOrderByProductoPromocion);				
			this.jmenuDatosProductoPromocion.add(this.jMenuItemMostrarOcultarProductoPromocion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoPromocion.add(this.jMenuItemGuardarCambiosProductoPromocion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoPromocion.add(this.jmenuArchivoProductoPromocion);		
			this.jmenuBarProductoPromocion.add(this.jmenuAccionesProductoPromocion);		
			this.jmenuBarProductoPromocion.add(this.jmenuDatosProductoPromocion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoPromocion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoPromocion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoPromocion.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoPromocion= new JButtonMe();
		this.jButtonFK_IdBodegaProductoPromocion.setText("Buscar");
		this.jButtonFK_IdBodegaProductoPromocion.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoPromocion,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoPromocion = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoPromocion.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoPromocion.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoPromocion= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaRelacionProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaRelacionProductoPromocion.setToolTipText("Buscar Por Bodega Relacion ");
		this.jButtonFK_IdBodegaRelacionProductoPromocion= new JButtonMe();
		this.jButtonFK_IdBodegaRelacionProductoPromocion.setText("Buscar");
		this.jButtonFK_IdBodegaRelacionProductoPromocion.setToolTipText("Buscar Por Bodega Relacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaRelacionProductoPromocion,"buscar_button","Buscar Por Bodega Relacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaRelacionProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion = new JLabelMe();
		jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setText("Bodega Relacion :");
		jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setToolTipText("Bodega Relacion");
		jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion= new JComboBoxMe();
		jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoPromocion.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoPromocion= new JButtonMe();
		this.jButtonFK_IdProductoProductoPromocion.setText("Buscar");
		this.jButtonFK_IdProductoProductoPromocion.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoPromocion,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoPromocion = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoPromocion.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoPromocion.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoPromocion= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoPromocion= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoPromocion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoPromocion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoPromocion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoPromocion.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoPromocion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoPromocion.setFocusable(false);

		this.jPanelFK_IdProductoRelacionProductoPromocion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoRelacionProductoPromocion.setToolTipText("Buscar Por Producto Relacion ");
		this.jButtonFK_IdProductoRelacionProductoPromocion= new JButtonMe();
		this.jButtonFK_IdProductoRelacionProductoPromocion.setText("Buscar");
		this.jButtonFK_IdProductoRelacionProductoPromocion.setToolTipText("Buscar Por Producto Relacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoRelacionProductoPromocion,"buscar_button","Buscar Por Producto Relacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoRelacionProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion = new JLabelMe();
		jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion.setText("Producto Relacion :");
		jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion.setToolTipText("Producto Relacion");
		jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion= new JComboBoxMe();
		jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion= new JButtonMe();
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion.setText("Buscar");
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion.setFocusable(false);


		this.jTabbedPaneBusquedasProductoPromocion=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoPromocion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoPromocion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoPromocion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoPromocion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoPromocion = new ProductoPromocionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Promocion DATOS");
			this.jInternalFrameDetalleFormProductoPromocion = new ProductoPromocionDetalleFormJInternalFrame(jDesktopPane,this.productopromocionSessionBean.getConGuardarRelaciones(),this.productopromocionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoPromocion = null;//new ProductoPromocionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoPromocion= new GridBagLayout();
		
		
		this.jTableDatosProductoPromocion = new JTableMe();      
		
		String sToolTipProductoPromocion="";
		sToolTipProductoPromocion=ProductoPromocionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoPromocion+="(Inventario.ProductoPromocion)";
		}
		
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoPromocion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoPromocion.setToolTipText(sToolTipProductoPromocion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoPromocion);
		this.jTableDatosProductoPromocion.setAutoCreateRowSorter(true);
		this.jTableDatosProductoPromocion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoPromocion.setRowSelectionAllowed(true);
		this.jTableDatosProductoPromocion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoPromocion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoPromocion = new JButtonMe();
		this.jButtonDuplicarProductoPromocion = new JButtonMe();
		this.jButtonCopiarProductoPromocion = new JButtonMe();
		this.jButtonVerFormProductoPromocion = new JButtonMe();
		this.jButtonNuevoRelacionesProductoPromocion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoPromocion = new JButtonMe();
		this.jButtonCerrarProductoPromocion = new JButtonMe();
		
		this.jScrollPanelDatosProductoPromocion = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoPromocion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Promocion";
		
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Promocions" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoPromocion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoPromocion.setToolTipText("Acciones");
        this.jPanelAccionesProductoPromocion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoPromocion=new ReporteDinamicoJInternalFrame(ProductoPromocionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoPromocion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoPromocion=new ImportacionJInternalFrame(ProductoPromocionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoPromocion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoPromocion = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoPromocion.setText("Orden");
		this.jButtonAbrirOrderByProductoPromocion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoPromocion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoPromocion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoPromocion,false,this);
			
			//this.cargarOrderByProductoPromocion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoPromocion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoPromocion,true,this);
			
			//this.cargarOrderByProductoPromocion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoPromocion.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoPromocion.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoPromocion.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosProductoPromocion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoPromocion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoPromocion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoPromocion.setText("Nuevo");
		this.jButtonDuplicarProductoPromocion.setText("Duplicar");
		this.jButtonCopiarProductoPromocion.setText("Copiar");
		this.jButtonVerFormProductoPromocion.setText("Ver");
		this.jButtonNuevoRelacionesProductoPromocion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoPromocion.setText("Guardar");
		this.jButtonCerrarProductoPromocion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoPromocion,"nuevo_button","Nuevo",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoPromocion,"duplicar_button","Duplicar",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoPromocion,"copiar_button","Copiar",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoPromocion,"ver_form","Ver",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoPromocion,"nuevorelaciones_button","Nuevo Rel",this.productopromocionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoPromocion,"guardarcambiostabla_button","Guardar",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoPromocion,"cerrar_button","Salir",this.productopromocionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoPromocion.setToolTipText("Nuevo"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoPromocion.setToolTipText("Duplicar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoPromocion.setToolTipText("Copiar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoPromocion.setToolTipText("Ver"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoPromocion.setToolTipText("Nuevo Rel"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoPromocion.setToolTipText("Guardar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoPromocion.setToolTipText("Salir"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoPromocion";
		inputMap = this.jButtonNuevoProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoPromocion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoPromocion"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoPromocion";
		inputMap = this.jButtonDuplicarProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoPromocion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoPromocion"));
		
		//COPIAR
		sMapKey = "CopiarProductoPromocion";
		inputMap = this.jButtonCopiarProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoPromocion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoPromocion"));
		
		//VEr FORM
		sMapKey = "VerFormProductoPromocion";
		inputMap = this.jButtonVerFormProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoPromocion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoPromocion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoPromocion";
		inputMap = this.jButtonNuevoRelacionesProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoPromocion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoPromocion";
		inputMap = this.jButtonModificarProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoPromocion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoPromocion";
		inputMap = this.jButtonCerrarProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoPromocion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoPromocion";
		inputMap = this.jButtonGuardarCambiosTablaProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoPromocion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoPromocion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoPromocion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoPromocion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoPromocion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoPromocion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoPromocion.setName("jPanelParametrosReportesProductoPromocion"); 
		
		this.jPanelParametrosReportesAccionesProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoPromocion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoPromocion.setName("jPanelParametrosReportesAccionesProductoPromocion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoPromocion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoPromocion = new JButtonMe();
		this.jButtonRecargarInformacionProductoPromocion.setText("Recargar");
		this.jButtonRecargarInformacionProductoPromocion.setToolTipText("Recargar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoPromocion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoPromocion = new JButtonMe();
		this.jButtonProcesarInformacionProductoPromocion.setText("Procesar");
		this.jButtonProcesarInformacionProductoPromocion.setToolTipText("Procesar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoPromocion.setVisible(false);
			
		this.jButtonProcesarInformacionProductoPromocion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoPromocion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoPromocion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoPromocion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoPromocion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoPromocion.setText("TIPO");       
		this.jComboBoxTiposReportesProductoPromocion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoPromocion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoPromocion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoPromocion.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoPromocion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoPromocion.setText("Accion");
		this.jComboBoxTiposRelacionesProductoPromocion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoPromocion.setText("Accion");
		this.jComboBoxTiposAccionesProductoPromocion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoPromocion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoPromocion.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoPromocion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoPromocion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoPromocion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoPromocion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoPromocion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoPromocion = new JLabelMe();
		
		this.jLabelAccionesProductoPromocion.setText("Acciones");		
		this.jLabelAccionesProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoPromocion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoPromocion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoPromocion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoPromocion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoPromocion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoPromocion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoPromocion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoPromocion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoPromocion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoPromocion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoPromocion.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoPromocion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoPromocion = new JButtonMe();
		//this.jButtonAnterioresProductoPromocion.setText("<<");
        this.jButtonAnterioresProductoPromocion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoPromocion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoPromocion = new JButtonMe();
		//this.jButtonSiguientesProductoPromocion.setText(">>");
        this.jButtonSiguientesProductoPromocion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoPromocion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoPromocion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoPromocion.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoPromocion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoPromocion,"nuevoguardarcambios_button","Nue",this.productopromocionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoPromocion";
		inputMap = this.jButtonNuevoGuardarCambiosProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoPromocion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoPromocion";
		inputMap = this.jButtonRecargarInformacionProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoPromocion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoPromocion";
		inputMap = this.jButtonSiguientesProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoPromocion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoPromocion";
		inputMap = this.jButtonAnterioresProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoPromocion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoPromocion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoPromocion.setMinimumSize(new Dimension(this.getWidth(),ProductoPromocionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoPromocionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoPromocion.setMaximumSize(new Dimension(this.getWidth(),ProductoPromocionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoPromocionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoPromocion.setPreferredSize(new Dimension(this.getWidth(),ProductoPromocionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoPromocionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoPromocion = new GridBagLayout();

			this.jPanelPaginacionProductoPromocion.setLayout(gridaBagLayoutPaginacionProductoPromocion);						
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = 0;
			this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoPromocion.add(this.jButtonAnterioresProductoPromocion, this.gridBagConstraintsProductoPromocion);
					
						
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoPromocion.gridy = 0;
			
			this.jPanelPaginacionProductoPromocion.add(this.jButtonNuevoGuardarCambiosProductoPromocion, this.gridBagConstraintsProductoPromocion);
						
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoPromocion.gridy = 0;
			this.jPanelPaginacionProductoPromocion.add(this.jButtonSiguientesProductoPromocion, this.gridBagConstraintsProductoPromocion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = 1;
			this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoPromocion.add(this.jButtonNuevoProductoPromocion, this.gridBagConstraintsProductoPromocion);
						
			
			
			if(!this.productopromocionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
				this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoPromocion.gridy = 1;
				this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoPromocion.add(this.jButtonGuardarCambiosTablaProductoPromocion, this.gridBagConstraintsProductoPromocion);
			}
			
			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = 1;
			this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoPromocion.add(this.jButtonDuplicarProductoPromocion, this.gridBagConstraintsProductoPromocion);
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = 1;
			this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoPromocion.add(this.jButtonCopiarProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = 1;
			this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoPromocion.add(this.jButtonVerFormProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = 1;
			this.gridBagConstraintsProductoPromocion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoPromocion.add(this.jButtonCerrarProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		
		
		this.jButtonRecargarInformacionProductoPromocion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoPromocion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoPromocion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoPromocion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoPromocion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoPromocion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoPromocion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoPromocion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoPromocion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoPromocion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoPromocion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoPromocion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoPromocion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoPromocion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoPromocion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoPromocion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoPromocion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoPromocion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoPromocion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoPromocion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoPromocion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoPromocion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoPromocion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoPromocion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoPromocion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoPromocion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoPromocion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoPromocion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoPromocion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoPromocion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoPromocion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoPromocion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoPromocion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoPromocion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoPromocion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoPromocion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoPromocion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoPromocion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoPromocion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoPromocion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoPromocion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoPromocion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoPromocion.setLayout(gridaBagParametrosReportesProductoPromocion);
			this.jPanelParametrosReportesAccionesProductoPromocion.setLayout(gridaBagParametrosReportesAccionesProductoPromocion);
			
			
			this.jPanelParametrosAuxiliar1ProductoPromocion.setLayout(gridaBagParametrosAuxiliar1ProductoPromocion);
			this.jPanelParametrosAuxiliar2ProductoPromocion.setLayout(gridaBagParametrosAuxiliar2ProductoPromocion);
			this.jPanelParametrosAuxiliar3ProductoPromocion.setLayout(gridaBagParametrosAuxiliar3ProductoPromocion);
			this.jPanelParametrosAuxiliar4ProductoPromocion.setLayout(gridaBagParametrosAuxiliar4ProductoPromocion);
			//this.jPanelParametrosAuxiliar5ProductoPromocion.setLayout(gridaBagParametrosAuxiliar2ProductoPromocion);			
			
			
			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoPromocion.add(this.jButtonRecargarInformacionProductoPromocion, this.gridBagConstraintsProductoPromocion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoPromocion.add(this.jComboBoxTiposPaginacionProductoPromocion, this.gridBagConstraintsProductoPromocion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoPromocion.add(this.jCheckBoxConAltoMaximoTablaProductoPromocion, this.gridBagConstraintsProductoPromocion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoPromocion.add(this.jComboBoxTiposArchivosReportesProductoPromocion, this.gridBagConstraintsProductoPromocion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPromocion.add(this.jPanelParametrosAuxiliar1ProductoPromocion, this.gridBagConstraintsProductoPromocion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoPromocion.add(this.jComboBoxTiposReportesProductoPromocion, this.gridBagConstraintsProductoPromocion);																		
			
			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoPromocion.add(this.jComboBoxTiposGraficosReportesProductoPromocion, this.gridBagConstraintsProductoPromocion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPromocion.add(this.jPanelParametrosAuxiliar4ProductoPromocion, this.gridBagConstraintsProductoPromocion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPromocion.add(this.jComboBoxTiposReportesProductoPromocion, this.gridBagConstraintsProductoPromocion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoPromocion.add(this.jCheckBoxGenerarReporteProductoPromocion, this.gridBagConstraintsProductoPromocion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPromocion.add(this.jPanelParametrosAuxiliar2ProductoPromocion, this.gridBagConstraintsProductoPromocion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoPromocion.add(this.jLabelAccionesProductoPromocion, this.gridBagConstraintsProductoPromocion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
				this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoPromocion.add(this.jButtonAbrirOrderByProductoPromocion, this.gridBagConstraintsProductoPromocion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoPromocion.add(this.jComboBoxTiposSeleccionarProductoPromocion, this.gridBagConstraintsProductoPromocion);			
			
			
			/*
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoPromocion.add(this.jCheckBoxSeleccionarTodosProductoPromocion, this.gridBagConstraintsProductoPromocion);
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoPromocion.add(this.jCheckBoxConGraficoReporteProductoPromocion, this.gridBagConstraintsProductoPromocion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoPromocion.add(this.jCheckBoxSeleccionarTodosProductoPromocion, this.gridBagConstraintsProductoPromocion);															
				
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoPromocion.add(this.jCheckBoxSeleccionadosProductoPromocion, this.gridBagConstraintsProductoPromocion);															
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoPromocion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoPromocion.add(this.jCheckBoxConGraficoReporteProductoPromocion, this.gridBagConstraintsProductoPromocion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoPromocion.add(this.jPanelParametrosAuxiliar3ProductoPromocion, this.gridBagConstraintsProductoPromocion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoPromocion.add(this.jComboBoxTiposAccionesProductoPromocion, this.gridBagConstraintsProductoPromocion);
	
				
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoPromocion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoPromocion.add(this.jTextFieldValorCampoGeneralProductoPromocion, this.gridBagConstraintsProductoPromocion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoPromocion = new GridBagLayout();

			this.jScrollPanelDatosProductoPromocion.setLayout(gridaBagLayoutDatosProductoPromocion);
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = 0;
			this.gridBagConstraintsProductoPromocion.gridx = 0;
			
			this.jScrollPanelDatosProductoPromocion.add(this.jTableDatosProductoPromocion, this.gridBagConstraintsProductoPromocion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoPromocion.setViewportView(this.jTableDatosProductoPromocion);
		this.jTableDatosProductoPromocion.setFillsViewportHeight(true);
		this.jTableDatosProductoPromocion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoPromocion= new GridBagLayout();
		this.jPanelAccionesProductoPromocion.setLayout(gridaBagLayoutAccionesProductoPromocion);
		
		
		/*	
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = 0;
		this.gridBagConstraintsProductoPromocion.gridx = 0;
			
		this.jPanelAccionesProductoPromocion.add(this.jButtonNuevoProductoPromocion, this.gridBagConstraintsProductoPromocion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoPromocion= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoPromocion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoPromocion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoPromocion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoPromocion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoPromocion.setLayout(gridaBagLayoutFK_IdBodegaProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 0;
		jPanelFK_IdBodegaProductoPromocion.add(jLabelid_bodegaFK_IdBodegaProductoPromocion, gridBagConstraintsProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 1;
		jPanelFK_IdBodegaProductoPromocion.add(jComboBoxid_bodegaFK_IdBodegaProductoPromocion, gridBagConstraintsProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 1;
		gridBagConstraintsProductoPromocion.gridx =1;
		jPanelFK_IdBodegaProductoPromocion.add(jButtonFK_IdBodegaProductoPromocion, gridBagConstraintsProductoPromocion);

		jTabbedPaneBusquedasProductoPromocion.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoPromocion);
		jTabbedPaneBusquedasProductoPromocion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaRelacionProductoPromocion= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaRelacionProductoPromocion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaRelacionProductoPromocion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaRelacionProductoPromocion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaRelacionProductoPromocion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaRelacionProductoPromocion.setLayout(gridaBagLayoutFK_IdBodegaRelacionProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 0;
		jPanelFK_IdBodegaRelacionProductoPromocion.add(jLabelid_bodega_relacionFK_IdBodegaRelacionProductoPromocion, gridBagConstraintsProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 1;
		jPanelFK_IdBodegaRelacionProductoPromocion.add(jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion, gridBagConstraintsProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 1;
		gridBagConstraintsProductoPromocion.gridx =1;
		jPanelFK_IdBodegaRelacionProductoPromocion.add(jButtonFK_IdBodegaRelacionProductoPromocion, gridBagConstraintsProductoPromocion);

		jTabbedPaneBusquedasProductoPromocion.addTab("2.-Por Bodega Relacion ", jPanelFK_IdBodegaRelacionProductoPromocion);
		jTabbedPaneBusquedasProductoPromocion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoPromocion= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoPromocion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoPromocion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoPromocion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoPromocion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoPromocion.setLayout(gridaBagLayoutFK_IdProductoProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 0;
		jPanelFK_IdProductoProductoPromocion.add(jLabelid_productoFK_IdProductoProductoPromocion, gridBagConstraintsProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 1;
		jPanelFK_IdProductoProductoPromocion.add(jComboBoxid_productoFK_IdProductoProductoPromocion, gridBagConstraintsProductoPromocion);


		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 0;
		jPanelFK_IdProductoProductoPromocion.add(this.jButtonBuscarFK_IdProductoid_productoProductoPromocion, gridBagConstraintsProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 1;
		gridBagConstraintsProductoPromocion.gridx =1;
		jPanelFK_IdProductoProductoPromocion.add(jButtonFK_IdProductoProductoPromocion, gridBagConstraintsProductoPromocion);

		jTabbedPaneBusquedasProductoPromocion.addTab("3.-Por Producto ", jPanelFK_IdProductoProductoPromocion);
		jTabbedPaneBusquedasProductoPromocion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoRelacionProductoPromocion= new GridBagLayout();
		gridaBagLayoutFK_IdProductoRelacionProductoPromocion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoRelacionProductoPromocion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoRelacionProductoPromocion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoRelacionProductoPromocion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoRelacionProductoPromocion.setLayout(gridaBagLayoutFK_IdProductoRelacionProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 0;
		jPanelFK_IdProductoRelacionProductoPromocion.add(jLabelid_producto_relacionFK_IdProductoRelacionProductoPromocion, gridBagConstraintsProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 1;
		jPanelFK_IdProductoRelacionProductoPromocion.add(jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion, gridBagConstraintsProductoPromocion);


		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoPromocion.gridy = 0;
		gridBagConstraintsProductoPromocion.gridx = 0;
		jPanelFK_IdProductoRelacionProductoPromocion.add(this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion, gridBagConstraintsProductoPromocion);

		gridBagConstraintsProductoPromocion = new GridBagConstraints();
		gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoPromocion.gridy = 1;
		gridBagConstraintsProductoPromocion.gridx =1;
		jPanelFK_IdProductoRelacionProductoPromocion.add(jButtonFK_IdProductoRelacionProductoPromocion, gridBagConstraintsProductoPromocion);

		jTabbedPaneBusquedasProductoPromocion.addTab("4.-Por Producto Relacion ", jPanelFK_IdProductoRelacionProductoPromocion);
		jTabbedPaneBusquedasProductoPromocion.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoPromocion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoPromocion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();						
			this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoPromocion.gridx = 0;		
			//this.gridBagConstraintsProductoPromocion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoPromocion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoPromocion, this.gridBagConstraintsProductoPromocion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoPromocion.gridx = 0;		
		//this.gridBagConstraintsProductoPromocion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoPromocion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoPromocion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoPromocion.gridx = 0;		
			this.gridBagConstraintsProductoPromocion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoPromocion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoPromocion, this.gridBagConstraintsProductoPromocion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoPromocion, this.gridBagConstraintsProductoPromocion);								
		
		
		/*
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoPromocion, this.gridBagConstraintsProductoPromocion);
		*/		
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoPromocion.gridx =0;
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoPromocion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoPromocion, this.gridBagConstraintsProductoPromocion);
				
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoPromocion, this.gridBagConstraintsProductoPromocion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoPromocion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoPromocion = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoPromocion.setLayout(gridaBagLayoutBusquedasParametrosProductoPromocion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoPromocion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoPromocion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoPromocion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoPromocion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoPromocion, this.gridBagConstraintsProductoPromocion);
			
			
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
			
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoPromocion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoPromocion, this.gridBagConstraintsProductoPromocion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoPromocion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoPromocion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoPromocion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoPromocion.setName("jPanelReporteDinamicoProductoPromocion"); 
		
		this.jPanelReporteDinamicoProductoPromocion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoPromocion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoPromocion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoPromocion.setLayout(gridaBagLayoutReporteDinamicoProductoPromocion);
		
		
		this.jInternalFrameReporteDinamicoProductoPromocion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoPromocion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoPromocion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoPromocion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoPromocion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoPromocion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoPromocion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoPromocion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoPromocion.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoPromocion.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoPromocion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoPromocion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoPromocion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoPromocion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Promocions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoPromocion = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoPromocion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoPromocion.add(this.jLabelColumnasSelectReporteProductoPromocion, this.gridBagConstraintsProductoPromocion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoPromocion = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoPromocion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoPromocion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoPromocion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoPromocion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoPromocion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoPromocion=new JScrollPane(this.jListColumnasSelectReporteProductoPromocion);
			
			this.jScrollColumnasSelectReporteProductoPromocion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoPromocion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoPromocion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoPromocion.add(this.jListColumnasSelectReporteProductoPromocion, this.gridBagConstraintsProductoPromocion);
		this.jPanelReporteDinamicoProductoPromocion.add(this.jScrollColumnasSelectReporteProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoPromocion = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoPromocion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoPromocion = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoPromocion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoPromocion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoPromocion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoPromocion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoPromocion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoPromocion=new JScrollPane(this.jListRelacionesSelectReporteProductoPromocion);
			
			this.jScrollRelacionesSelectReporteProductoPromocion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoPromocion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoPromocion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoPromocion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoPromocion = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoPromocion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoPromocion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoPromocion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoPromocion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoPromocion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoPromocion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoPromocion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoPromocion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoPromocion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoPromocion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoPromocion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoPromocion = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoPromocion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoPromocion.add(this.jLabelConGraficoDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoPromocion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoPromocion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoPromocion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoPromocion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoPromocion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoPromocion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPromocion.add(this.jCheckBoxConGraficoDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoPromocion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoPromocion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoPromocion.add(this.jLabelColumnaCategoriaGraficoProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoPromocion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoPromocion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoPromocion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoPromocion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoPromocion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoPromocion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoPromocion.add(this.jComboBoxColumnaCategoriaGraficoProductoPromocion, this.gridBagConstraintsProductoPromocion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoPromocion = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoPromocion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPromocion.add(this.jLabelColumnaCategoriaValorProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoPromocion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoPromocion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoPromocion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoPromocion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoPromocion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoPromocion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoPromocion.add(this.jComboBoxColumnaCategoriaValorProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoPromocion = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoPromocion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPromocion.add(this.jLabelColumnasValoresGraficoProductoPromocion, this.gridBagConstraintsProductoPromocion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoPromocion = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoPromocion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoPromocion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoPromocion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoPromocion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoPromocion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoPromocion=new JScrollPane(this.jListColumnasValoresGraficoProductoPromocion);
			
			this.jScrollColumnasValoresGraficoProductoPromocion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoPromocion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoPromocion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoPromocion.add(this.jListColumnasSelectReporteProductoPromocion, this.gridBagConstraintsProductoPromocion);
		this.jPanelReporteDinamicoProductoPromocion.add(this.jScrollColumnasValoresGraficoProductoPromocion, this.gridBagConstraintsProductoPromocion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoPromocion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoPromocion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPromocion.add(this.jLabelTiposGraficosReportesDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoPromocion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoPromocion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoPromocion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoPromocion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoPromocion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoPromocion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPromocion.add(this.jComboBoxTiposGraficosReportesDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoPromocion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoPromocion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPromocion.add(this.jLabelGenerarExcelReporteDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoPromocion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoPromocion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoPromocion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoPromocion.setToolTipText("Generar EXCEL"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		//this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoPromocion.add(this.jButtonGenerarExcelReporteDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoPromocion.add(this.jComboBoxTiposReportesDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoPromocion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoPromocion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoPromocion.add(this.jLabelTiposArchivoReporteDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoPromocion.add(this.jComboBoxTiposArchivosReportesDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoPromocion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoPromocion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoPromocion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoPromocion.setToolTipText("Generar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoPromocion.add(this.jButtonGenerarReporteDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoPromocion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoPromocion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoPromocion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoPromocion.setToolTipText("Cancelar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoPromocion.add(this.jButtonCerrarReporteDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoPromocion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoPromocion= new JScrollPane(jPanelReporteDinamicoProductoPromocion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoPromocion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoPromocion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoPromocion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Promocions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoPromocion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoPromocion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoPromocion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoPromocion);
		this.jInternalFrameReporteDinamicoProductoPromocion.getContentPane().add(this.jScrollPanelReporteDinamicoProductoPromocion, this.gridBagConstraintsProductoPromocion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoPromocion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoPromocion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoPromocion.setName("jPanelImportacionProductoPromocion"); 
		
		this.jPanelImportacionProductoPromocion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoPromocion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoPromocion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoPromocion.setLayout(gridaBagLayoutImportacionProductoPromocion);
		
		
		this.jInternalFrameImportacionProductoPromocion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoPromocion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoPromocion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoPromocion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoPromocion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoPromocion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoPromocion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoPromocion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoPromocion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoPromocion.setResizable(true);
	    this.jInternalFrameImportacionProductoPromocion.setClosable(true);
	    this.jInternalFrameImportacionProductoPromocion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoPromocion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoPromocion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoPromocion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoPromocion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoPromocion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoPromocion.setResizable(true);
	    this.jInternalFrameImportacionProductoPromocion.setClosable(true);
	    this.jInternalFrameImportacionProductoPromocion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoPromocion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoPromocion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoPromocion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Promocions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoPromocion = new JLabelMe();

		this.jLabelArchivoImportacionProductoPromocion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoPromocion.add(this.jLabelArchivoImportacionProductoPromocion, this.gridBagConstraintsProductoPromocion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoPromocion = new JFileChooser();		
		this.jFileChooserImportacionProductoPromocion.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoPromocion = new JButtonMe();
		this.jButtonAbrirImportacionProductoPromocion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoPromocion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoPromocion.setToolTipText("Generar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoPromocion.add(this.jButtonAbrirImportacionProductoPromocion, this.gridBagConstraintsProductoPromocion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoPromocion = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoPromocion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoPromocion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoPromocion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoPromocion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoPromocion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoPromocion.add(this.jLabelPathArchivoImportacionProductoPromocion, this.gridBagConstraintsProductoPromocion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoPromocion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoPromocion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoPromocion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoPromocion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoPromocion.add(this.jTextFieldPathArchivoImportacionProductoPromocion, this.gridBagConstraintsProductoPromocion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoPromocion = new JButtonMe();
		this.jButtonGenerarImportacionProductoPromocion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoPromocion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoPromocion.setToolTipText("Generar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoPromocion.add(this.jButtonGenerarImportacionProductoPromocion, this.gridBagConstraintsProductoPromocion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoPromocion = new JButtonMe();
		this.jButtonCerrarImportacionProductoPromocion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoPromocion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoPromocion.setToolTipText("Cancelar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoPromocion.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoPromocion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoPromocion.add(this.jButtonCerrarImportacionProductoPromocion, this.gridBagConstraintsProductoPromocion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoPromocion = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoPromocion= new JScrollPane(jPanelImportacionProductoPromocion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
		this.gridBagConstraintsProductoPromocion.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoPromocion.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoPromocion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoPromocion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoPromocion);
		this.jInternalFrameImportacionProductoPromocion.getContentPane().add(this.jScrollPanelImportacionProductoPromocion, this.gridBagConstraintsProductoPromocion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoPromocion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoPromocion = new JButtonMe();
			this.jButtonAbrirOrderByProductoPromocion.setText("Orden");
			this.jButtonAbrirOrderByProductoPromocion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoPromocion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoPromocion";
			inputMap = this.jButtonAbrirOrderByProductoPromocion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoPromocion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoPromocion"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoPromocion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoPromocion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoPromocion.setName("jPanelOrderByProductoPromocion"); 
			
			this.jPanelOrderByProductoPromocion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoPromocion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoPromocion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoPromocion.setLayout(gridaBagLayoutOrderByProductoPromocion);
			
			
			this.jTableDatosProductoPromocionOrderBy = new JTableMe();        
			this.jTableDatosProductoPromocionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoPromocionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoPromocionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoPromocionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoPromocionOrderBy.setViewportView(this.jTableDatosProductoPromocionOrderBy);
			this.jTableDatosProductoPromocionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoPromocionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoPromocion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoPromocion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoPromocion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoPromocion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoPromocion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoPromocion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoPromocion.setTitle("Orden");
			this.jInternalFrameOrderByProductoPromocion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoPromocion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoPromocion.setResizable(true);
			this.jInternalFrameOrderByProductoPromocion.setClosable(true);
			this.jInternalFrameOrderByProductoPromocion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoPromocion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoPromocion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoPromocion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoPromocion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Promocions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoPromocion.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoPromocion.ipady =150;
				
			this.jPanelOrderByProductoPromocion.add(jScrollPanelDatosProductoPromocionOrderBy, this.gridBagConstraintsProductoPromocion);//this.jTableDatosProductoPromocionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoPromocion = new JButtonMe();
			this.jButtonCerrarOrderByProductoPromocion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoPromocion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoPromocion.setToolTipText("Cancelar"+" "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoPromocion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoPromocion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoPromocion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoPromocion.add(this.jButtonCerrarOrderByProductoPromocion, this.gridBagConstraintsProductoPromocion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoPromocion = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoPromocion= new JScrollPane(jPanelOrderByProductoPromocion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoPromocion = new GridBagConstraints();
			this.gridBagConstraintsProductoPromocion.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoPromocion.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoPromocion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoPromocion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoPromocion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoPromocion);
			
			this.jInternalFrameOrderByProductoPromocion.getContentPane().add(this.jScrollPanelOrderByProductoPromocion, this.gridBagConstraintsProductoPromocion);			
		
		} else {
			this.jButtonAbrirOrderByProductoPromocion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productopromocionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoPromocion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoPromocion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoPromocion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoPromocion.getRowHeight();//ProductoPromocionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoPromocionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoPromocion.isSelected()) {
					iHeightTable=ProductoPromocionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoPromocionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoPromocionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoPromocionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoPromocion.isSelected()) {
					iHeightTable=ProductoPromocionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoPromocionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoPromocionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoPromocion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoPromocion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoPromocion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoPromocion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoPromocion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoPromocion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoPromocion!=null && this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy()!=null) {
			//if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoPromocion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoPromocion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoPromocion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoPromocion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoPromocion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoPromocion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productopromocionLogic.getProductoPromocions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productopromocions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoPromocion> TraerProductoPromocionBeans(List<ProductoPromocion> productopromocions,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoPromocion productopromocion:productopromocions) {
					
				if(!(ProductoPromocionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoPromocionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productopromocion.setsDetalleGeneralEntityReporte(ProductoPromocionConstantesFunciones.getProductoPromocionDescripcion(productopromocion));
										
						
					
						
					
				} else  {
							
					//productopromocion.setsDetalleGeneralEntityReporte(productopromocion.getsDetalleGeneralEntityReporte());
										
				}
				
				//productopromocionbeans.add(productopromocionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productopromocions;
    }
	//PARA REPORTES FIN
}
