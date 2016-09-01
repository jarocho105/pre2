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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.inventario.util.ProductoProveedorConstantesFunciones;

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
public class ProductoProveedorJInternalFrame extends ProductoProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoProveedor;
	
	protected JMenuBar jmenuBarProductoProveedor;
	
	protected JMenu jmenuProductoProveedor;
	protected JMenu jmenuDatosProductoProveedor;
	protected JMenu jmenuArchivoProductoProveedor;
	protected JMenu jmenuAccionesProductoProveedor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProveedor;	
	protected GridBagConstraints gridBagConstraintsProductoProveedor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoProveedorDetalleFormJInternalFrame jInternalFrameDetalleFormProductoProveedor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoProveedor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoProveedor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ProductoProveedorSessionBean productoproveedorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoProveedor> productoproveedors;		
	public List<ProductoProveedor> productoproveedorsEliminados;	
	public List<ProductoProveedor> productoproveedorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoProveedor;		
	protected JButton jButtonAbrirOrderByProductoProveedor;
	
	
	//protected JPanel jPanelOrderByProductoProveedor;
	//public JScrollPane jScrollPanelOrderByProductoProveedor;	
	//protected JButton jButtonCerrarOrderByProductoProveedor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoProveedorLogic productoproveedorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoProveedor;
	public JScrollPane jScrollPanelDatosEdicionProductoProveedor;
	public JScrollPane jScrollPanelDatosGeneralProductoProveedor;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoProveedorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoProveedor;
	//public JScrollPane jScrollPanelImportacionProductoProveedor;
	
	
	
	protected JPanel jPanelAccionesProductoProveedor;
	
    protected JPanel jPanelPaginacionProductoProveedor;
    protected JPanel jPanelParametrosReportesProductoProveedor;
	protected JPanel jPanelParametrosReportesAccionesProductoProveedor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoProveedor;
	protected JPanel jPanelParametrosAuxiliar2ProductoProveedor;
	protected JPanel jPanelParametrosAuxiliar3ProductoProveedor;
	protected JPanel jPanelParametrosAuxiliar4ProductoProveedor;
	//protected JPanel jPanelParametrosAuxiliar5ProductoProveedor;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoProveedor;
	//protected JPanel jPanelImportacionProductoProveedor;
	
	
	public JTable jTableDatosProductoProveedor;
	
	
	
	//public JTable jTableDatosProductoProveedorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoProveedor;
	protected JButton jButtonDuplicarProductoProveedor;
	protected JButton jButtonCopiarProductoProveedor;
	protected JButton jButtonVerFormProductoProveedor;
	protected JButton jButtonNuevoRelacionesProductoProveedor;
	protected JButton jButtonModificarProductoProveedor;
	
    protected JButton jButtonGuardarCambiosTablaProductoProveedor;
	protected JButton jButtonCerrarProductoProveedor;
	
	
	protected JButton jButtonRecargarInformacionProductoProveedor;
	protected JButton jButtonProcesarInformacionProductoProveedor;
	
	
	protected JButton jButtonAnterioresProductoProveedor;
	protected JButton jButtonSiguientesProductoProveedor;
	protected JButton jButtonNuevoGuardarCambiosProductoProveedor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoProveedor;
	//protected JButton jButtonCerrarReporteDinamicoProductoProveedor;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoProveedor;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoProveedor;
	//protected JButton jButtonGenerarImportacionProductoProveedor;
	//protected JButton jButtonCerrarImportacionProductoProveedor;
	//protected JFileChooser jFileChooserImportacionProductoProveedor;
	//protected File fileImportacionProductoProveedor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProveedor;
	protected JButton jButtonDuplicarToolBarProductoProveedor;
	protected JButton jButtonNuevoRelacionesToolBarProductoProveedor;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoProveedor;
	protected JButton jButtonCopiarToolBarProductoProveedor;
	protected JButton jButtonVerFormToolBarProductoProveedor;
	public JButton jButtonGuardarCambiosTablaToolBarProductoProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProveedor;
	protected JButton jButtonCerrarToolBarProductoProveedor;
	
	protected JButton jButtonRecargarInformacionToolBarProductoProveedor;
	protected JButton jButtonProcesarInformacionToolBarProductoProveedor;
	protected JButton jButtonAnterioresToolBarProductoProveedor;
	protected JButton jButtonSiguientesToolBarProductoProveedor;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoProveedor;
	protected JButton jButtonAbrirOrderByToolBarProductoProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProveedor;
	protected JMenuItem jMenuItemDuplicarProductoProveedor;
	protected JMenuItem jMenuItemNuevoRelacionesProductoProveedor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoProveedor;
	protected JMenuItem jMenuItemCopiarProductoProveedor;
	protected JMenuItem jMenuItemVerFormProductoProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProveedor;
	protected JMenuItem jMenuItemCerrarProductoProveedor;
	protected JMenuItem jMenuItemDetalleCerrarProductoProveedor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProveedor;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoProveedor;
	protected JMenuItem jMenuItemProcesarInformacionProductoProveedor;
	protected JMenuItem jMenuItemAnterioresProductoProveedor;
	protected JMenuItem jMenuItemSiguientesProductoProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProveedor;
	protected JMenuItem jMenuItemAbrirOrderByProductoProveedor;
	protected JMenuItem jMenuItemMostrarOcultarProductoProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProveedor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoProveedor;
	protected JCheckBox jCheckBoxSeleccionadosProductoProveedor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoProveedor;
	protected JCheckBox jCheckBoxConGraficoReporteProductoProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoProveedor;
	protected JTextField jTextFieldValorCampoGeneralProductoProveedor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoProveedor;
	//public JList<Reporte> jListColumnasSelectReporteProductoProveedor;
	//public JScrollPane jScrollColumnasSelectReporteProductoProveedor;
	
	//public JLabel jLabelRelacionesSelectReporteProductoProveedor;
	//public JList<Reporte> jListRelacionesSelectReporteProductoProveedor;
	//public JScrollPane jScrollRelacionesSelectReporteProductoProveedor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoProveedor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoProveedor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoProveedor;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoProveedor;
	
		
	//public JLabel jLabelArchivoImportacionProductoProveedor;	
	//public JLabel jLabelPathArchivoImportacionProductoProveedor;
	//protected JTextField jTextFieldPathArchivoImportacionProductoProveedor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoProveedor;
	
	//public JLabel jLabelColumnaCategoriaValorProductoProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoProveedor;
	
	//public JLabel jLabelColumnasValoresGraficoProductoProveedor;
	//public JList<Reporte> jListColumnasValoresGraficoProductoProveedor;
	//public JScrollPane jScrollColumnasValoresGraficoProductoProveedor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoProveedor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoProveedor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoProveedor;
	public JPanel jPanelFK_IdBodegaProductoProveedor;
	public JButton jButtonFK_IdBodegaProductoProveedor;
	public JPanel jPanelFK_IdClienteProductoProveedor;
	public JButton jButtonFK_IdClienteProductoProveedor;
	public JPanel jPanelFK_IdProductoProductoProveedor;
	public JButton jButtonFK_IdProductoProductoProveedor;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoProveedor;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoProveedor;
	public JButton jButtonid_bodegaFK_IdBodegaProductoProveedor= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoProveedorUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteProductoProveedor;
	public JLabel jLabelid_clienteFK_IdClienteProductoProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteProductoProveedor;
	public JButton jButtonid_clienteFK_IdClienteProductoProveedor= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteProductoProveedorUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteProductoProveedorBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteProductoProveedor;
	
	public JPanel jPanelid_productoFK_IdProductoProductoProveedor;
	public JLabel jLabelid_productoFK_IdProductoProductoProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoProveedor;
	public JButton jButtonid_productoFK_IdProductoProductoProveedor= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoProveedorUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoProveedorBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoProveedor;
	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoProveedorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProveedorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProveedorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProveedorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoProveedor)	{
		this.jButtonRecargarInformacionProductoProveedor = jButtonRecargarInformacionProductoProveedor;
	}
	
	public JButton getjButtonProcesarInformacionProductoProveedor() {
		return this.jButtonProcesarInformacionProductoProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProveedor)	{
		this.jButtonProcesarInformacionProductoProveedor = jButtonProcesarInformacionProductoProveedor;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoProveedor() {
		return this.jButtonRecargarInformacionProductoProveedor;
	}
	
	
	public List<ProductoProveedor> getproductoproveedors() {
		return this.productoproveedors;
	}

	public void setproductoproveedors(List<ProductoProveedor> productoproveedors) {
		this.productoproveedors = productoproveedors;
	}
	
	public List<ProductoProveedor> getproductoproveedorsAux() {
		return this.productoproveedorsAux;
	}

	public void setproductoproveedorsAux(List<ProductoProveedor> productoproveedorsAux) {
		this.productoproveedorsAux = productoproveedorsAux;
	}
	
	public List<ProductoProveedor> getproductoproveedorsEliminados() {
		return this.productoproveedorsEliminados;
	}

	public void setProductoProveedorsEliminados(List<ProductoProveedor> productoproveedorsEliminados) {
		this.productoproveedorsEliminados = productoproveedorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoProveedor() {
		return jComboBoxTiposSeleccionarProductoProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoProveedor(
			JComboBox jComboBoxTiposSeleccionarProductoProveedor) {
		this.jComboBoxTiposSeleccionarProductoProveedor = jComboBoxTiposSeleccionarProductoProveedor;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoProveedor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoProveedor() {
		return jTextFieldValorCampoGeneralProductoProveedor;
	}

	public void setjTextFieldValorCampoGeneralProductoProveedor(
			JTextField jTextFieldValorCampoGeneralProductoProveedor) {
		this.jTextFieldValorCampoGeneralProductoProveedor = jTextFieldValorCampoGeneralProductoProveedor;
	}

	public void setBorderResaltarValorCampoGeneralProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoProveedor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoProveedor() {
		return this.jCheckBoxSeleccionarTodosProductoProveedor;
	}

	public void setjCheckBoxSeleccionarTodosProductoProveedor(
			JCheckBox jCheckBoxSeleccionarTodosProductoProveedor) {
		this.jCheckBoxSeleccionarTodosProductoProveedor = jCheckBoxSeleccionarTodosProductoProveedor;
	}

	public void setBorderResaltarSeleccionarTodosProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoProveedor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoProveedor() {
		return this.jCheckBoxSeleccionadosProductoProveedor;
	}

	public void setjCheckBoxSeleccionadosProductoProveedor(
			JCheckBox jCheckBoxSeleccionadosProductoProveedor) {
		this.jCheckBoxSeleccionadosProductoProveedor = jCheckBoxSeleccionadosProductoProveedor;
	}
	
	public void setBorderResaltarSeleccionadosProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoProveedor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoProveedor() {
		return this.jComboBoxTiposArchivosReportesProductoProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoProveedor(
			JComboBox jComboBoxTiposArchivosReportesProductoProveedor) {
		this.jComboBoxTiposArchivosReportesProductoProveedor = jComboBoxTiposArchivosReportesProductoProveedor;
	}

	public void setBorderResaltarTiposArchivosReportesProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoProveedor() {
		return this.jComboBoxTiposReportesProductoProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoProveedor(
			JComboBox jComboBoxTiposReportesProductoProveedor) {
		this.jComboBoxTiposReportesProductoProveedor = jComboBoxTiposReportesProductoProveedor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoProveedor() {
	//	return jComboBoxTiposReportesDinamicoProductoProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoProveedor(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoProveedor) {
	//	this.jComboBoxTiposReportesDinamicoProductoProveedor = jComboBoxTiposReportesDinamicoProductoProveedor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoProveedor() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoProveedor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProveedor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoProveedor = jComboBoxTiposArchivosReportesDinamicoProductoProveedor;
	//}
	
	public void setBorderResaltarTiposReportesProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoProveedor() {
		return this.jComboBoxTiposGraficosReportesProductoProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoProveedor(
			JComboBox jComboBoxTiposGraficosReportesProductoProveedor) {
		this.jComboBoxTiposGraficosReportesProductoProveedor = jComboBoxTiposGraficosReportesProductoProveedor;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoProveedor() {
		return this.jComboBoxTiposPaginacionProductoProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoProveedor(
			JComboBox jComboBoxTiposPaginacionProductoProveedor) {
		this.jComboBoxTiposPaginacionProductoProveedor = jComboBoxTiposPaginacionProductoProveedor;
	}
	
	public void setBorderResaltarTiposPaginacionProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoProveedor() {
		return this.jComboBoxTiposRelacionesProductoProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProveedor() {
		return this.jComboBoxTiposAccionesProductoProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProveedor(
			JComboBox jComboBoxTiposRelacionesProductoProveedor) {
		this.jComboBoxTiposRelacionesProductoProveedor = jComboBoxTiposRelacionesProductoProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProveedor(
			JComboBox jComboBoxTiposAccionesProductoProveedor) {
		this.jComboBoxTiposAccionesProductoProveedor = jComboBoxTiposAccionesProductoProveedor;
	}
	
	public void setBorderResaltarTiposRelacionesProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoProveedor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoProveedor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoProveedor() {
	//	return jCheckBoxConGraficoDinamicoProductoProveedor;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoProveedor(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoProveedor) {
	//	this.jCheckBoxConGraficoDinamicoProductoProveedor = jCheckBoxConGraficoDinamicoProductoProveedor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoProveedor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoProveedor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoProveedor .setBorder(borderResaltar);		
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
		this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
		
		this.productoproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoproveedorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoProveedor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"nuevo","nuevo","Nuevo"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"duplicar","duplicar","Duplicar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"copiar","copiar","Copiar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"ver_form","ver_form","Ver"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"recargar","recargar","Recargar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoProveedor,this.jTtoolBarProductoProveedor,
							"cerrar","cerrar","Salir"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoProveedor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoProveedor;
			
				this.jButtonProcesarInformacionToolBarProductoProveedor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoProveedor;
				
		//protected JButton jButtonModificarToolBarProductoProveedor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoProveedor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoProveedor=new JMenuMe("General");
		this.jmenuArchivoProductoProveedor=new JMenuMe("Archivo");
		this.jmenuAccionesProductoProveedor=new JMenuMe("Acciones");
		this.jmenuDatosProductoProveedor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoProveedor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoProveedor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoProveedor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoProveedor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoProveedor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoProveedor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoProveedor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoProveedor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoProveedor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoProveedor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoProveedor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoProveedor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoProveedor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoProveedor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoProveedor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoProveedor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoProveedor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoProveedor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoProveedor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoProveedor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoProveedor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoProveedor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoProveedor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoProveedor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoProveedor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoProveedor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoProveedor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoProveedor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoProveedor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoProveedor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoProveedor.add(this.jMenuItemCerrarProductoProveedor);
			
			this.jmenuAccionesProductoProveedor.add(this.jMenuItemNuevoProductoProveedor);
			this.jmenuAccionesProductoProveedor.add(this.jMenuItemNuevoGuardarCambiosProductoProveedor);
			this.jmenuAccionesProductoProveedor.add(this.jMenuItemNuevoRelacionesProductoProveedor);
			this.jmenuAccionesProductoProveedor.add(this.jMenuItemGuardarCambiosTablaProductoProveedor);		
			this.jmenuAccionesProductoProveedor.add(this.jMenuItemDuplicarProductoProveedor);		
			this.jmenuAccionesProductoProveedor.add(this.jMenuItemCopiarProductoProveedor);		
			this.jmenuAccionesProductoProveedor.add(this.jMenuItemVerFormProductoProveedor);		
			
			this.jmenuDatosProductoProveedor.add(this.jMenuItemRecargarInformacionProductoProveedor);				
			this.jmenuDatosProductoProveedor.add(this.jMenuItemAnterioresProductoProveedor);				
			this.jmenuDatosProductoProveedor.add(this.jMenuItemSiguientesProductoProveedor);				
			this.jmenuDatosProductoProveedor.add(this.jMenuItemAbrirOrderByProductoProveedor);				
			this.jmenuDatosProductoProveedor.add(this.jMenuItemMostrarOcultarProductoProveedor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoProveedor.add(this.jMenuItemGuardarCambiosProductoProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoProveedor.add(this.jmenuArchivoProductoProveedor);		
			this.jmenuBarProductoProveedor.add(this.jmenuAccionesProductoProveedor);		
			this.jmenuBarProductoProveedor.add(this.jmenuDatosProductoProveedor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoProveedor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoProveedor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoProveedor.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoProveedor= new JButtonMe();
		this.jButtonFK_IdBodegaProductoProveedor.setText("Buscar");
		this.jButtonFK_IdBodegaProductoProveedor.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoProveedor,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoProveedor = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoProveedor.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoProveedor.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoProveedor= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProductoProveedor.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteProductoProveedor= new JButtonMe();
		this.jButtonFK_IdClienteProductoProveedor.setText("Buscar");
		this.jButtonFK_IdClienteProductoProveedor.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProductoProveedor,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteProductoProveedor = new JLabelMe();
		jLabelid_clienteFK_IdClienteProductoProveedor.setText("Cliente :");
		jLabelid_clienteFK_IdClienteProductoProveedor.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteProductoProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteProductoProveedor= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteProductoProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor.setFocusable(false);

		this.jPanelFK_IdProductoProductoProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoProveedor.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoProveedor= new JButtonMe();
		this.jButtonFK_IdProductoProductoProveedor.setText("Buscar");
		this.jButtonFK_IdProductoProductoProveedor.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoProveedor,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoProveedor = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoProveedor.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoProveedor.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoProveedor= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoProveedor= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoProveedor.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoProveedor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoProveedor.setFocusable(false);


		this.jTabbedPaneBusquedasProductoProveedor=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoProveedor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProveedor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProveedor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoProveedor = new ProductoProveedorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Proveedor DATOS");
			this.jInternalFrameDetalleFormProductoProveedor = new ProductoProveedorDetalleFormJInternalFrame(jDesktopPane,this.productoproveedorSessionBean.getConGuardarRelaciones(),this.productoproveedorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoProveedor = null;//new ProductoProveedorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProveedor= new GridBagLayout();
		
		
		this.jTableDatosProductoProveedor = new JTableMe();      
		
		String sToolTipProductoProveedor="";
		sToolTipProductoProveedor=ProductoProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProveedor+="(Inventario.ProductoProveedor)";
		}
		
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProveedor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoProveedor.setToolTipText(sToolTipProductoProveedor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoProveedor);
		this.jTableDatosProductoProveedor.setAutoCreateRowSorter(true);
		this.jTableDatosProductoProveedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoProveedor.setRowSelectionAllowed(true);
		this.jTableDatosProductoProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoProveedor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoProveedor = new JButtonMe();
		this.jButtonDuplicarProductoProveedor = new JButtonMe();
		this.jButtonCopiarProductoProveedor = new JButtonMe();
		this.jButtonVerFormProductoProveedor = new JButtonMe();
		this.jButtonNuevoRelacionesProductoProveedor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoProveedor = new JButtonMe();
		this.jButtonCerrarProductoProveedor = new JButtonMe();
		
		this.jScrollPanelDatosProductoProveedor = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoProveedor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Proveedor";
		
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProveedor.setToolTipText("Acciones");
        this.jPanelAccionesProductoProveedor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoProveedor=new ReporteDinamicoJInternalFrame(ProductoProveedorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoProveedor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoProveedor=new ImportacionJInternalFrame(ProductoProveedorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoProveedor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoProveedor = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoProveedor.setText("Orden");
		this.jButtonAbrirOrderByProductoProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProveedor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProveedor,false,this);
			
			//this.cargarOrderByProductoProveedor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProveedor,true,this);
			
			//this.cargarOrderByProductoProveedor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoProveedor.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosProductoProveedor.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosProductoProveedor.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosProductoProveedor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProveedor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProveedor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoProveedor.setText("Nuevo");
		this.jButtonDuplicarProductoProveedor.setText("Duplicar");
		this.jButtonCopiarProductoProveedor.setText("Copiar");
		this.jButtonVerFormProductoProveedor.setText("Ver");
		this.jButtonNuevoRelacionesProductoProveedor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoProveedor.setText("Guardar");
		this.jButtonCerrarProductoProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProveedor,"nuevo_button","Nuevo",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoProveedor,"duplicar_button","Duplicar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoProveedor,"copiar_button","Copiar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoProveedor,"ver_form","Ver",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoProveedor,"nuevorelaciones_button","Nuevo Rel",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProveedor,"guardarcambiostabla_button","Guardar",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProveedor,"cerrar_button","Salir",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoProveedor.setToolTipText("Nuevo"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoProveedor.setToolTipText("Duplicar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoProveedor.setToolTipText("Copiar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoProveedor.setToolTipText("Ver"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoProveedor.setToolTipText("Nuevo Rel"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoProveedor.setToolTipText("Guardar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProveedor.setToolTipText("Salir"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProveedor";
		inputMap = this.jButtonNuevoProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProveedor"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoProveedor";
		inputMap = this.jButtonDuplicarProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoProveedor"));
		
		//COPIAR
		sMapKey = "CopiarProductoProveedor";
		inputMap = this.jButtonCopiarProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoProveedor"));
		
		//VEr FORM
		sMapKey = "VerFormProductoProveedor";
		inputMap = this.jButtonVerFormProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoProveedor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoProveedor";
		inputMap = this.jButtonNuevoRelacionesProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoProveedor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoProveedor";
		inputMap = this.jButtonModificarProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoProveedor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoProveedor";
		inputMap = this.jButtonCerrarProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProveedor";
		inputMap = this.jButtonGuardarCambiosTablaProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProveedor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoProveedor.setName("jPanelParametrosReportesProductoProveedor"); 
		
		this.jPanelParametrosReportesAccionesProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoProveedor.setName("jPanelParametrosReportesAccionesProductoProveedor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoProveedor = new JButtonMe();
		this.jButtonRecargarInformacionProductoProveedor.setText("Recargar");
		this.jButtonRecargarInformacionProductoProveedor.setToolTipText("Recargar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoProveedor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoProveedor = new JButtonMe();
		this.jButtonProcesarInformacionProductoProveedor.setText("Procesar");
		this.jButtonProcesarInformacionProductoProveedor.setToolTipText("Procesar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoProveedor.setVisible(false);
			
		this.jButtonProcesarInformacionProductoProveedor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProveedor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProveedor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProveedor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoProveedor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProveedor.setText("TIPO");       
		this.jComboBoxTiposReportesProductoProveedor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProveedor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoProveedor.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoProveedor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoProveedor.setText("Accion");
		this.jComboBoxTiposRelacionesProductoProveedor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProveedor.setText("Accion");
		this.jComboBoxTiposAccionesProductoProveedor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoProveedor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoProveedor.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoProveedor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoProveedor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoProveedor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProveedor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProveedor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoProveedor = new JLabelMe();
		
		this.jLabelAccionesProductoProveedor.setText("Acciones");		
		this.jLabelAccionesProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoProveedor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoProveedor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoProveedor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoProveedor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoProveedor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoProveedor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoProveedor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoProveedor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoProveedor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoProveedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoProveedor.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoProveedor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoProveedor = new JButtonMe();
		//this.jButtonAnterioresProductoProveedor.setText("<<");
        this.jButtonAnterioresProductoProveedor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoProveedor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoProveedor = new JButtonMe();
		//this.jButtonSiguientesProductoProveedor.setText(">>");
        this.jButtonSiguientesProductoProveedor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoProveedor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoProveedor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoProveedor.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoProveedor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoProveedor,"nuevoguardarcambios_button","Nue",this.productoproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoProveedor";
		inputMap = this.jButtonNuevoGuardarCambiosProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoProveedor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoProveedor";
		inputMap = this.jButtonRecargarInformacionProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoProveedor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoProveedor";
		inputMap = this.jButtonSiguientesProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoProveedor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoProveedor";
		inputMap = this.jButtonAnterioresProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoProveedor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoProveedor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoProveedor.setMinimumSize(new Dimension(this.getWidth(),ProductoProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProveedor.setMaximumSize(new Dimension(this.getWidth(),ProductoProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProveedor.setPreferredSize(new Dimension(this.getWidth(),ProductoProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoProveedor = new GridBagLayout();

			this.jPanelPaginacionProductoProveedor.setLayout(gridaBagLayoutPaginacionProductoProveedor);						
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = 0;
			this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoProveedor.add(this.jButtonAnterioresProductoProveedor, this.gridBagConstraintsProductoProveedor);
					
						
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProveedor.gridy = 0;
			
			this.jPanelPaginacionProductoProveedor.add(this.jButtonNuevoGuardarCambiosProductoProveedor, this.gridBagConstraintsProductoProveedor);
						
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProveedor.gridy = 0;
			this.jPanelPaginacionProductoProveedor.add(this.jButtonSiguientesProductoProveedor, this.gridBagConstraintsProductoProveedor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = 1;
			this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProveedor.add(this.jButtonNuevoProductoProveedor, this.gridBagConstraintsProductoProveedor);
						
			
			
			if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
				this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoProveedor.gridy = 1;
				this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoProveedor.add(this.jButtonGuardarCambiosTablaProductoProveedor, this.gridBagConstraintsProductoProveedor);
			}
			
			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = 1;
			this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProveedor.add(this.jButtonDuplicarProductoProveedor, this.gridBagConstraintsProductoProveedor);
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = 1;
			this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProveedor.add(this.jButtonCopiarProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = 1;
			this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProveedor.add(this.jButtonVerFormProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = 1;
			this.gridBagConstraintsProductoProveedor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoProveedor.add(this.jButtonCerrarProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		
		
		this.jButtonRecargarInformacionProductoProveedor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProveedor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProveedor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoProveedor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProveedor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProveedor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoProveedor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProveedor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProveedor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoProveedor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProveedor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProveedor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoProveedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProveedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProveedor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoProveedor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProveedor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProveedor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoProveedor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoProveedor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoProveedor.setLayout(gridaBagParametrosReportesProductoProveedor);
			this.jPanelParametrosReportesAccionesProductoProveedor.setLayout(gridaBagParametrosReportesAccionesProductoProveedor);
			
			
			this.jPanelParametrosAuxiliar1ProductoProveedor.setLayout(gridaBagParametrosAuxiliar1ProductoProveedor);
			this.jPanelParametrosAuxiliar2ProductoProveedor.setLayout(gridaBagParametrosAuxiliar2ProductoProveedor);
			this.jPanelParametrosAuxiliar3ProductoProveedor.setLayout(gridaBagParametrosAuxiliar3ProductoProveedor);
			this.jPanelParametrosAuxiliar4ProductoProveedor.setLayout(gridaBagParametrosAuxiliar4ProductoProveedor);
			//this.jPanelParametrosAuxiliar5ProductoProveedor.setLayout(gridaBagParametrosAuxiliar2ProductoProveedor);			
			
			
			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProveedor.add(this.jButtonRecargarInformacionProductoProveedor, this.gridBagConstraintsProductoProveedor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProveedor.add(this.jComboBoxTiposPaginacionProductoProveedor, this.gridBagConstraintsProductoProveedor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProveedor.add(this.jCheckBoxConAltoMaximoTablaProductoProveedor, this.gridBagConstraintsProductoProveedor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProveedor.add(this.jComboBoxTiposArchivosReportesProductoProveedor, this.gridBagConstraintsProductoProveedor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProveedor.add(this.jPanelParametrosAuxiliar1ProductoProveedor, this.gridBagConstraintsProductoProveedor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoProveedor.add(this.jComboBoxTiposReportesProductoProveedor, this.gridBagConstraintsProductoProveedor);																		
			
			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoProveedor.add(this.jComboBoxTiposGraficosReportesProductoProveedor, this.gridBagConstraintsProductoProveedor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProveedor.add(this.jPanelParametrosAuxiliar4ProductoProveedor, this.gridBagConstraintsProductoProveedor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProveedor.add(this.jComboBoxTiposReportesProductoProveedor, this.gridBagConstraintsProductoProveedor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProveedor.add(this.jCheckBoxGenerarReporteProductoProveedor, this.gridBagConstraintsProductoProveedor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProveedor.add(this.jPanelParametrosAuxiliar2ProductoProveedor, this.gridBagConstraintsProductoProveedor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProveedor.add(this.jLabelAccionesProductoProveedor, this.gridBagConstraintsProductoProveedor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
				this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoProveedor.add(this.jButtonAbrirOrderByProductoProveedor, this.gridBagConstraintsProductoProveedor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProveedor.add(this.jComboBoxTiposSeleccionarProductoProveedor, this.gridBagConstraintsProductoProveedor);			
			
			
			/*
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProveedor.add(this.jCheckBoxSeleccionarTodosProductoProveedor, this.gridBagConstraintsProductoProveedor);
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProveedor.add(this.jCheckBoxConGraficoReporteProductoProveedor, this.gridBagConstraintsProductoProveedor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProveedor.add(this.jCheckBoxSeleccionarTodosProductoProveedor, this.gridBagConstraintsProductoProveedor);															
				
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProveedor.add(this.jCheckBoxSeleccionadosProductoProveedor, this.gridBagConstraintsProductoProveedor);															
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProveedor.add(this.jCheckBoxConGraficoReporteProductoProveedor, this.gridBagConstraintsProductoProveedor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProveedor.add(this.jPanelParametrosAuxiliar3ProductoProveedor, this.gridBagConstraintsProductoProveedor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProveedor.add(this.jComboBoxTiposAccionesProductoProveedor, this.gridBagConstraintsProductoProveedor);
	
				
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProveedor.add(this.jTextFieldValorCampoGeneralProductoProveedor, this.gridBagConstraintsProductoProveedor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoProveedor = new GridBagLayout();

			this.jScrollPanelDatosProductoProveedor.setLayout(gridaBagLayoutDatosProductoProveedor);
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = 0;
			this.gridBagConstraintsProductoProveedor.gridx = 0;
			
			this.jScrollPanelDatosProductoProveedor.add(this.jTableDatosProductoProveedor, this.gridBagConstraintsProductoProveedor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoProveedor.setViewportView(this.jTableDatosProductoProveedor);
		this.jTableDatosProductoProveedor.setFillsViewportHeight(true);
		this.jTableDatosProductoProveedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoProveedor= new GridBagLayout();
		this.jPanelAccionesProductoProveedor.setLayout(gridaBagLayoutAccionesProductoProveedor);
		
		
		/*	
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = 0;
		this.gridBagConstraintsProductoProveedor.gridx = 0;
			
		this.jPanelAccionesProductoProveedor.add(this.jButtonNuevoProductoProveedor, this.gridBagConstraintsProductoProveedor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoProveedor.setLayout(gridaBagLayoutFK_IdBodegaProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 0;
		gridBagConstraintsProductoProveedor.gridx = 0;
		jPanelFK_IdBodegaProductoProveedor.add(jLabelid_bodegaFK_IdBodegaProductoProveedor, gridBagConstraintsProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 0;
		gridBagConstraintsProductoProveedor.gridx = 1;
		jPanelFK_IdBodegaProductoProveedor.add(jComboBoxid_bodegaFK_IdBodegaProductoProveedor, gridBagConstraintsProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 1;
		gridBagConstraintsProductoProveedor.gridx =1;
		jPanelFK_IdBodegaProductoProveedor.add(jButtonFK_IdBodegaProductoProveedor, gridBagConstraintsProductoProveedor);

		jTabbedPaneBusquedasProductoProveedor.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoProveedor);
		jTabbedPaneBusquedasProductoProveedor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteProductoProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProductoProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProductoProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProductoProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProductoProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProductoProveedor.setLayout(gridaBagLayoutFK_IdClienteProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 0;
		gridBagConstraintsProductoProveedor.gridx = 0;
		jPanelFK_IdClienteProductoProveedor.add(jLabelid_clienteFK_IdClienteProductoProveedor, gridBagConstraintsProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 0;
		gridBagConstraintsProductoProveedor.gridx = 1;
		jPanelFK_IdClienteProductoProveedor.add(jComboBoxid_clienteFK_IdClienteProductoProveedor, gridBagConstraintsProductoProveedor);


		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoProveedor.gridy = 0;
		gridBagConstraintsProductoProveedor.gridx = 0;
		jPanelFK_IdClienteProductoProveedor.add(this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor, gridBagConstraintsProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 1;
		gridBagConstraintsProductoProveedor.gridx =1;
		jPanelFK_IdClienteProductoProveedor.add(jButtonFK_IdClienteProductoProveedor, gridBagConstraintsProductoProveedor);

		jTabbedPaneBusquedasProductoProveedor.addTab("2.-Por Cliente ", jPanelFK_IdClienteProductoProveedor);
		jTabbedPaneBusquedasProductoProveedor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoProveedor.setLayout(gridaBagLayoutFK_IdProductoProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 0;
		gridBagConstraintsProductoProveedor.gridx = 0;
		jPanelFK_IdProductoProductoProveedor.add(jLabelid_productoFK_IdProductoProductoProveedor, gridBagConstraintsProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 0;
		gridBagConstraintsProductoProveedor.gridx = 1;
		jPanelFK_IdProductoProductoProveedor.add(jComboBoxid_productoFK_IdProductoProductoProveedor, gridBagConstraintsProductoProveedor);


		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoProveedor.gridy = 0;
		gridBagConstraintsProductoProveedor.gridx = 0;
		jPanelFK_IdProductoProductoProveedor.add(this.jButtonBuscarFK_IdProductoid_productoProductoProveedor, gridBagConstraintsProductoProveedor);

		gridBagConstraintsProductoProveedor = new GridBagConstraints();
		gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProveedor.gridy = 1;
		gridBagConstraintsProductoProveedor.gridx =1;
		jPanelFK_IdProductoProductoProveedor.add(jButtonFK_IdProductoProductoProveedor, gridBagConstraintsProductoProveedor);

		jTabbedPaneBusquedasProductoProveedor.addTab("3.-Por Producto ", jPanelFK_IdProductoProductoProveedor);
		jTabbedPaneBusquedasProductoProveedor.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProveedor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();						
			this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProveedor.gridx = 0;		
			//this.gridBagConstraintsProductoProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProveedor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoProveedor, this.gridBagConstraintsProductoProveedor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoProveedor.gridx = 0;		
		//this.gridBagConstraintsProductoProveedor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoProveedor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoProveedor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProveedor.gridx = 0;		
			this.gridBagConstraintsProductoProveedor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoProveedor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoProveedor, this.gridBagConstraintsProductoProveedor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoProveedor, this.gridBagConstraintsProductoProveedor);								
		
		
		/*
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoProveedor, this.gridBagConstraintsProductoProveedor);
		*/		
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProveedor.gridx =0;
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProveedor, this.gridBagConstraintsProductoProveedor);
				
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoProveedor, this.gridBagConstraintsProductoProveedor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProveedor = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoProveedor.setLayout(gridaBagLayoutBusquedasParametrosProductoProveedor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProveedor, this.gridBagConstraintsProductoProveedor);
			
			
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
			
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProveedor, this.gridBagConstraintsProductoProveedor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoProveedor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoProveedor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoProveedor.setName("jPanelReporteDinamicoProductoProveedor"); 
		
		this.jPanelReporteDinamicoProductoProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoProveedor.setLayout(gridaBagLayoutReporteDinamicoProductoProveedor);
		
		
		this.jInternalFrameReporteDinamicoProductoProveedor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoProveedor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoProveedor.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoProveedor.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoProveedor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoProveedor = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoProveedor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProveedor.add(this.jLabelColumnasSelectReporteProductoProveedor, this.gridBagConstraintsProductoProveedor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoProveedor = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoProveedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProveedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoProveedor=new JScrollPane(this.jListColumnasSelectReporteProductoProveedor);
			
			this.jScrollColumnasSelectReporteProductoProveedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProveedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProveedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoProveedor.add(this.jListColumnasSelectReporteProductoProveedor, this.gridBagConstraintsProductoProveedor);
		this.jPanelReporteDinamicoProductoProveedor.add(this.jScrollColumnasSelectReporteProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoProveedor = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoProveedor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoProveedor = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoProveedor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProveedor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoProveedor=new JScrollPane(this.jListRelacionesSelectReporteProductoProveedor);
			
			this.jScrollRelacionesSelectReporteProductoProveedor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProveedor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProveedor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoProveedor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoProveedor = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoProveedor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoProveedor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoProveedor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProveedor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoProveedor = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoProveedor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProveedor.add(this.jLabelConGraficoDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoProveedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoProveedor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoProveedor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoProveedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProveedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProveedor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProveedor.add(this.jCheckBoxConGraficoDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoProveedor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoProveedor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProveedor.add(this.jLabelColumnaCategoriaGraficoProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProveedor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoProveedor.add(this.jComboBoxColumnaCategoriaGraficoProductoProveedor, this.gridBagConstraintsProductoProveedor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoProveedor = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoProveedor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProveedor.add(this.jLabelColumnaCategoriaValorProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoProveedor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoProveedor.add(this.jComboBoxColumnaCategoriaValorProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoProveedor = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoProveedor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProveedor.add(this.jLabelColumnasValoresGraficoProductoProveedor, this.gridBagConstraintsProductoProveedor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoProveedor = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoProveedor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoProveedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProveedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoProveedor=new JScrollPane(this.jListColumnasValoresGraficoProductoProveedor);
			
			this.jScrollColumnasValoresGraficoProductoProveedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProveedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProveedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoProveedor.add(this.jListColumnasSelectReporteProductoProveedor, this.gridBagConstraintsProductoProveedor);
		this.jPanelReporteDinamicoProductoProveedor.add(this.jScrollColumnasValoresGraficoProductoProveedor, this.gridBagConstraintsProductoProveedor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoProveedor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoProveedor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProveedor.add(this.jLabelTiposGraficosReportesDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProveedor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProveedor.add(this.jComboBoxTiposGraficosReportesDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoProveedor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoProveedor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProveedor.add(this.jLabelGenerarExcelReporteDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoProveedor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoProveedor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoProveedor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoProveedor.setToolTipText("Generar EXCEL"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		//this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoProveedor.add(this.jButtonGenerarExcelReporteDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProveedor.add(this.jComboBoxTiposReportesDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoProveedor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoProveedor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProveedor.add(this.jLabelTiposArchivoReporteDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProveedor.add(this.jComboBoxTiposArchivosReportesDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoProveedor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoProveedor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoProveedor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoProveedor.setToolTipText("Generar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProveedor.add(this.jButtonGenerarReporteDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoProveedor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoProveedor.setToolTipText("Cancelar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProveedor.add(this.jButtonCerrarReporteDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoProveedor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoProveedor= new JScrollPane(jPanelReporteDinamicoProductoProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoProveedor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoProveedor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoProveedor);
		this.jInternalFrameReporteDinamicoProductoProveedor.getContentPane().add(this.jScrollPanelReporteDinamicoProductoProveedor, this.gridBagConstraintsProductoProveedor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoProveedor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoProveedor.setName("jPanelImportacionProductoProveedor"); 
		
		this.jPanelImportacionProductoProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoProveedor.setLayout(gridaBagLayoutImportacionProductoProveedor);
		
		
		this.jInternalFrameImportacionProductoProveedor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoProveedor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProveedor.setResizable(true);
	    this.jInternalFrameImportacionProductoProveedor.setClosable(true);
	    this.jInternalFrameImportacionProductoProveedor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProveedor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProveedor.setResizable(true);
	    this.jInternalFrameImportacionProductoProveedor.setClosable(true);
	    this.jInternalFrameImportacionProductoProveedor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoProveedor = new JLabelMe();

		this.jLabelArchivoImportacionProductoProveedor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProveedor.add(this.jLabelArchivoImportacionProductoProveedor, this.gridBagConstraintsProductoProveedor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoProveedor = new JFileChooser();		
		this.jFileChooserImportacionProductoProveedor.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoProveedor = new JButtonMe();
		this.jButtonAbrirImportacionProductoProveedor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoProveedor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoProveedor.setToolTipText("Generar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProveedor.add(this.jButtonAbrirImportacionProductoProveedor, this.gridBagConstraintsProductoProveedor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoProveedor = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoProveedor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProveedor.add(this.jLabelPathArchivoImportacionProductoProveedor, this.gridBagConstraintsProductoProveedor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoProveedor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoProveedor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProveedor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProveedor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProveedor.add(this.jTextFieldPathArchivoImportacionProductoProveedor, this.gridBagConstraintsProductoProveedor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoProveedor = new JButtonMe();
		this.jButtonGenerarImportacionProductoProveedor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoProveedor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoProveedor.setToolTipText("Generar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProveedor.add(this.jButtonGenerarImportacionProductoProveedor, this.gridBagConstraintsProductoProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoProveedor = new JButtonMe();
		this.jButtonCerrarImportacionProductoProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoProveedor.setToolTipText("Cancelar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProveedor.add(this.jButtonCerrarImportacionProductoProveedor, this.gridBagConstraintsProductoProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoProveedor = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoProveedor= new JScrollPane(jPanelImportacionProductoProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
		this.gridBagConstraintsProductoProveedor.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoProveedor.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoProveedor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoProveedor);
		this.jInternalFrameImportacionProductoProveedor.getContentPane().add(this.jScrollPanelImportacionProductoProveedor, this.gridBagConstraintsProductoProveedor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoProveedor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoProveedor = new JButtonMe();
			this.jButtonAbrirOrderByProductoProveedor.setText("Orden");
			this.jButtonAbrirOrderByProductoProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProveedor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoProveedor";
			inputMap = this.jButtonAbrirOrderByProductoProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoProveedor"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoProveedor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoProveedor.setName("jPanelOrderByProductoProveedor"); 
			
			this.jPanelOrderByProductoProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoProveedor.setLayout(gridaBagLayoutOrderByProductoProveedor);
			
			
			this.jTableDatosProductoProveedorOrderBy = new JTableMe();        
			this.jTableDatosProductoProveedorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoProveedorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoProveedorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoProveedorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoProveedorOrderBy.setViewportView(this.jTableDatosProductoProveedorOrderBy);
			this.jTableDatosProductoProveedorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoProveedorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoProveedor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoProveedor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoProveedor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoProveedor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoProveedor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoProveedor.setTitle("Orden");
			this.jInternalFrameOrderByProductoProveedor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoProveedor.setResizable(true);
			this.jInternalFrameOrderByProductoProveedor.setClosable(true);
			this.jInternalFrameOrderByProductoProveedor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Proveedors"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoProveedor.ipady =150;
				
			this.jPanelOrderByProductoProveedor.add(jScrollPanelDatosProductoProveedorOrderBy, this.gridBagConstraintsProductoProveedor);//this.jTableDatosProductoProveedorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoProveedor = new JButtonMe();
			this.jButtonCerrarOrderByProductoProveedor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoProveedor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoProveedor.setToolTipText("Cancelar"+" "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProveedor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoProveedor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoProveedor.add(this.jButtonCerrarOrderByProductoProveedor, this.gridBagConstraintsProductoProveedor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoProveedor = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoProveedor= new JScrollPane(jPanelOrderByProductoProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoProveedor = new GridBagConstraints();
			this.gridBagConstraintsProductoProveedor.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProveedor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoProveedor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoProveedor);
			
			this.jInternalFrameOrderByProductoProveedor.getContentPane().add(this.jScrollPanelOrderByProductoProveedor, this.gridBagConstraintsProductoProveedor);			
		
		} else {
			this.jButtonAbrirOrderByProductoProveedor = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoproveedorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoProveedor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoProveedor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoProveedor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoProveedor.getRowHeight();//ProductoProveedorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProveedor.isSelected()) {
					iHeightTable=ProductoProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProveedor.isSelected()) {
					iHeightTable=ProductoProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoProveedor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProveedor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProveedor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoProveedor!=null && this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy()!=null) {
			//if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoProveedor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoProveedor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoProveedor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoproveedorLogic.getProductoProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoproveedors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoProveedor> TraerProductoProveedorBeans(List<ProductoProveedor> productoproveedors,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoProveedor productoproveedor:productoproveedors) {
					
				if(!(ProductoProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoproveedor.setsDetalleGeneralEntityReporte(ProductoProveedorConstantesFunciones.getProductoProveedorDescripcion(productoproveedor));
										
						
					
						
					
				} else  {
							
					//productoproveedor.setsDetalleGeneralEntityReporte(productoproveedor.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoproveedorbeans.add(productoproveedorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoproveedors;
    }
	//PARA REPORTES FIN
}
