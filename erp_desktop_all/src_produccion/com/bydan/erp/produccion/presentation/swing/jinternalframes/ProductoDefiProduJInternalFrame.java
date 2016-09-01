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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.produccion.util.ProductoDefiProduConstantesFunciones;

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
public class ProductoDefiProduJInternalFrame extends ProductoDefiProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoDefiProdu;
	
	protected JMenuBar jmenuBarProductoDefiProdu;
	
	protected JMenu jmenuProductoDefiProdu;
	protected JMenu jmenuDatosProductoDefiProdu;
	protected JMenu jmenuArchivoProductoDefiProdu;
	protected JMenu jmenuAccionesProductoDefiProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoDefiProdu;	
	protected GridBagConstraints gridBagConstraintsProductoDefiProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoDefiProduDetalleFormJInternalFrame jInternalFrameDetalleFormProductoDefiProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoDefiProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoDefiProdu;	
	
	
	
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
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoDefiProdu> productodefiprodus;		
	public List<ProductoDefiProdu> productodefiprodusEliminados;	
	public List<ProductoDefiProdu> productodefiprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoDefiProdu;		
	protected JButton jButtonAbrirOrderByProductoDefiProdu;
	
	
	//protected JPanel jPanelOrderByProductoDefiProdu;
	//public JScrollPane jScrollPanelOrderByProductoDefiProdu;	
	//protected JButton jButtonCerrarOrderByProductoDefiProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoDefiProduLogic productodefiproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoDefiProdu;
	public JScrollPane jScrollPanelDatosEdicionProductoDefiProdu;
	public JScrollPane jScrollPanelDatosGeneralProductoDefiProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoDefiProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoDefiProdu;
	//public JScrollPane jScrollPanelImportacionProductoDefiProdu;
	
	
	
	protected JPanel jPanelAccionesProductoDefiProdu;
	
    protected JPanel jPanelPaginacionProductoDefiProdu;
    protected JPanel jPanelParametrosReportesProductoDefiProdu;
	protected JPanel jPanelParametrosReportesAccionesProductoDefiProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoDefiProdu;
	protected JPanel jPanelParametrosAuxiliar2ProductoDefiProdu;
	protected JPanel jPanelParametrosAuxiliar3ProductoDefiProdu;
	protected JPanel jPanelParametrosAuxiliar4ProductoDefiProdu;
	//protected JPanel jPanelParametrosAuxiliar5ProductoDefiProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoDefiProdu;
	//protected JPanel jPanelImportacionProductoDefiProdu;
	
	
	public JTable jTableDatosProductoDefiProdu;
	
	
	
	//public JTable jTableDatosProductoDefiProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoDefiProdu;
	protected JButton jButtonDuplicarProductoDefiProdu;
	protected JButton jButtonCopiarProductoDefiProdu;
	protected JButton jButtonVerFormProductoDefiProdu;
	protected JButton jButtonNuevoRelacionesProductoDefiProdu;
	protected JButton jButtonModificarProductoDefiProdu;
	
    protected JButton jButtonGuardarCambiosTablaProductoDefiProdu;
	protected JButton jButtonCerrarProductoDefiProdu;
	
	
	protected JButton jButtonRecargarInformacionProductoDefiProdu;
	protected JButton jButtonProcesarInformacionProductoDefiProdu;
	
	
	protected JButton jButtonAnterioresProductoDefiProdu;
	protected JButton jButtonSiguientesProductoDefiProdu;
	protected JButton jButtonNuevoGuardarCambiosProductoDefiProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoDefiProdu;
	//protected JButton jButtonCerrarReporteDinamicoProductoDefiProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoDefiProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoDefiProdu;
	//protected JButton jButtonGenerarImportacionProductoDefiProdu;
	//protected JButton jButtonCerrarImportacionProductoDefiProdu;
	//protected JFileChooser jFileChooserImportacionProductoDefiProdu;
	//protected File fileImportacionProductoDefiProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoDefiProdu;
	protected JButton jButtonDuplicarToolBarProductoDefiProdu;
	protected JButton jButtonNuevoRelacionesToolBarProductoDefiProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoDefiProdu;
	protected JButton jButtonCopiarToolBarProductoDefiProdu;
	protected JButton jButtonVerFormToolBarProductoDefiProdu;
	public JButton jButtonGuardarCambiosTablaToolBarProductoDefiProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoDefiProdu;
	protected JButton jButtonCerrarToolBarProductoDefiProdu;
	
	protected JButton jButtonRecargarInformacionToolBarProductoDefiProdu;
	protected JButton jButtonProcesarInformacionToolBarProductoDefiProdu;
	protected JButton jButtonAnterioresToolBarProductoDefiProdu;
	protected JButton jButtonSiguientesToolBarProductoDefiProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoDefiProdu;
	protected JButton jButtonAbrirOrderByToolBarProductoDefiProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoDefiProdu;
	protected JMenuItem jMenuItemDuplicarProductoDefiProdu;
	protected JMenuItem jMenuItemNuevoRelacionesProductoDefiProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoDefiProdu;
	protected JMenuItem jMenuItemCopiarProductoDefiProdu;
	protected JMenuItem jMenuItemVerFormProductoDefiProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoDefiProdu;
	protected JMenuItem jMenuItemCerrarProductoDefiProdu;
	protected JMenuItem jMenuItemDetalleCerrarProductoDefiProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoDefiProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoDefiProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoDefiProdu;
	protected JMenuItem jMenuItemProcesarInformacionProductoDefiProdu;
	protected JMenuItem jMenuItemAnterioresProductoDefiProdu;
	protected JMenuItem jMenuItemSiguientesProductoDefiProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoDefiProdu;
	protected JMenuItem jMenuItemAbrirOrderByProductoDefiProdu;
	protected JMenuItem jMenuItemMostrarOcultarProductoDefiProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoDefiProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoDefiProdu;
	protected JCheckBox jCheckBoxSeleccionadosProductoDefiProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoDefiProdu;
	protected JCheckBox jCheckBoxConGraficoReporteProductoDefiProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoDefiProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoDefiProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoDefiProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoDefiProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoDefiProdu;
	protected JTextField jTextFieldValorCampoGeneralProductoDefiProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoDefiProdu;
	//public JList<Reporte> jListColumnasSelectReporteProductoDefiProdu;
	//public JScrollPane jScrollColumnasSelectReporteProductoDefiProdu;
	
	//public JLabel jLabelRelacionesSelectReporteProductoDefiProdu;
	//public JList<Reporte> jListRelacionesSelectReporteProductoDefiProdu;
	//public JScrollPane jScrollRelacionesSelectReporteProductoDefiProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoDefiProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoDefiProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoDefiProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoDefiProdu;
	
		
	//public JLabel jLabelArchivoImportacionProductoDefiProdu;	
	//public JLabel jLabelPathArchivoImportacionProductoDefiProdu;
	//protected JTextField jTextFieldPathArchivoImportacionProductoDefiProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoDefiProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoDefiProdu;
	
	//public JLabel jLabelColumnaCategoriaValorProductoDefiProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoDefiProdu;
	
	//public JLabel jLabelColumnasValoresGraficoProductoDefiProdu;
	//public JList<Reporte> jListColumnasValoresGraficoProductoDefiProdu;
	//public JScrollPane jScrollColumnasValoresGraficoProductoDefiProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoDefiProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoDefiProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoDefiProdu;
	
	
	
	
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
	public ProductoDefiProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDefiProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDefiProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDefiProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoDefiProdu)	{
		this.jButtonRecargarInformacionProductoDefiProdu = jButtonRecargarInformacionProductoDefiProdu;
	}
	
	public JButton getjButtonProcesarInformacionProductoDefiProdu() {
		return this.jButtonProcesarInformacionProductoDefiProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoDefiProdu)	{
		this.jButtonProcesarInformacionProductoDefiProdu = jButtonProcesarInformacionProductoDefiProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoDefiProdu() {
		return this.jButtonRecargarInformacionProductoDefiProdu;
	}
	
	
	public List<ProductoDefiProdu> getproductodefiprodus() {
		return this.productodefiprodus;
	}

	public void setproductodefiprodus(List<ProductoDefiProdu> productodefiprodus) {
		this.productodefiprodus = productodefiprodus;
	}
	
	public List<ProductoDefiProdu> getproductodefiprodusAux() {
		return this.productodefiprodusAux;
	}

	public void setproductodefiprodusAux(List<ProductoDefiProdu> productodefiprodusAux) {
		this.productodefiprodusAux = productodefiprodusAux;
	}
	
	public List<ProductoDefiProdu> getproductodefiprodusEliminados() {
		return this.productodefiprodusEliminados;
	}

	public void setProductoDefiProdusEliminados(List<ProductoDefiProdu> productodefiprodusEliminados) {
		this.productodefiprodusEliminados = productodefiprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoDefiProdu() {
		return jComboBoxTiposSeleccionarProductoDefiProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoDefiProdu(
			JComboBox jComboBoxTiposSeleccionarProductoDefiProdu) {
		this.jComboBoxTiposSeleccionarProductoDefiProdu = jComboBoxTiposSeleccionarProductoDefiProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoDefiProdu() {
		return jTextFieldValorCampoGeneralProductoDefiProdu;
	}

	public void setjTextFieldValorCampoGeneralProductoDefiProdu(
			JTextField jTextFieldValorCampoGeneralProductoDefiProdu) {
		this.jTextFieldValorCampoGeneralProductoDefiProdu = jTextFieldValorCampoGeneralProductoDefiProdu;
	}

	public void setBorderResaltarValorCampoGeneralProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoDefiProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoDefiProdu() {
		return this.jCheckBoxSeleccionarTodosProductoDefiProdu;
	}

	public void setjCheckBoxSeleccionarTodosProductoDefiProdu(
			JCheckBox jCheckBoxSeleccionarTodosProductoDefiProdu) {
		this.jCheckBoxSeleccionarTodosProductoDefiProdu = jCheckBoxSeleccionarTodosProductoDefiProdu;
	}

	public void setBorderResaltarSeleccionarTodosProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoDefiProdu() {
		return this.jCheckBoxSeleccionadosProductoDefiProdu;
	}

	public void setjCheckBoxSeleccionadosProductoDefiProdu(
			JCheckBox jCheckBoxSeleccionadosProductoDefiProdu) {
		this.jCheckBoxSeleccionadosProductoDefiProdu = jCheckBoxSeleccionadosProductoDefiProdu;
	}
	
	public void setBorderResaltarSeleccionadosProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoDefiProdu() {
		return this.jComboBoxTiposArchivosReportesProductoDefiProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoDefiProdu(
			JComboBox jComboBoxTiposArchivosReportesProductoDefiProdu) {
		this.jComboBoxTiposArchivosReportesProductoDefiProdu = jComboBoxTiposArchivosReportesProductoDefiProdu;
	}

	public void setBorderResaltarTiposArchivosReportesProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoDefiProdu() {
		return this.jComboBoxTiposReportesProductoDefiProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoDefiProdu(
			JComboBox jComboBoxTiposReportesProductoDefiProdu) {
		this.jComboBoxTiposReportesProductoDefiProdu = jComboBoxTiposReportesProductoDefiProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoDefiProdu() {
	//	return jComboBoxTiposReportesDinamicoProductoDefiProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoDefiProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoDefiProdu) {
	//	this.jComboBoxTiposReportesDinamicoProductoDefiProdu = jComboBoxTiposReportesDinamicoProductoDefiProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoDefiProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoDefiProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu = jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu;
	//}
	
	public void setBorderResaltarTiposReportesProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoDefiProdu() {
		return this.jComboBoxTiposGraficosReportesProductoDefiProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoDefiProdu(
			JComboBox jComboBoxTiposGraficosReportesProductoDefiProdu) {
		this.jComboBoxTiposGraficosReportesProductoDefiProdu = jComboBoxTiposGraficosReportesProductoDefiProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoDefiProdu() {
		return this.jComboBoxTiposPaginacionProductoDefiProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoDefiProdu(
			JComboBox jComboBoxTiposPaginacionProductoDefiProdu) {
		this.jComboBoxTiposPaginacionProductoDefiProdu = jComboBoxTiposPaginacionProductoDefiProdu;
	}
	
	public void setBorderResaltarTiposPaginacionProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoDefiProdu() {
		return this.jComboBoxTiposRelacionesProductoDefiProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoDefiProdu() {
		return this.jComboBoxTiposAccionesProductoDefiProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoDefiProdu(
			JComboBox jComboBoxTiposRelacionesProductoDefiProdu) {
		this.jComboBoxTiposRelacionesProductoDefiProdu = jComboBoxTiposRelacionesProductoDefiProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoDefiProdu(
			JComboBox jComboBoxTiposAccionesProductoDefiProdu) {
		this.jComboBoxTiposAccionesProductoDefiProdu = jComboBoxTiposAccionesProductoDefiProdu;
	}
	
	public void setBorderResaltarTiposRelacionesProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoDefiProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoDefiProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoDefiProdu() {
	//	return jCheckBoxConGraficoDinamicoProductoDefiProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoDefiProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoDefiProdu) {
	//	this.jCheckBoxConGraficoDinamicoProductoDefiProdu = jCheckBoxConGraficoDinamicoProductoDefiProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoDefiProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoDefiProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoDefiProdu .setBorder(borderResaltar);		
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
		this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
		
		this.productodefiproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productodefiproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productodefiproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoDefiProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoDefiProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Definicion Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoDefiProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoDefiProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoDefiProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"nuevo","nuevo","Nuevo"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"duplicar","duplicar","Duplicar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"copiar","copiar","Copiar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"ver_form","ver_form","Ver"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"recargar","recargar","Recargar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoDefiProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoDefiProdu,this.jTtoolBarProductoDefiProdu,
							"cerrar","cerrar","Salir"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoDefiProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoDefiProdu;
			
				this.jButtonProcesarInformacionToolBarProductoDefiProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoDefiProdu;
				
		//protected JButton jButtonModificarToolBarProductoDefiProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoDefiProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoDefiProdu=new JMenuMe("General");
		this.jmenuArchivoProductoDefiProdu=new JMenuMe("Archivo");
		this.jmenuAccionesProductoDefiProdu=new JMenuMe("Acciones");
		this.jmenuDatosProductoDefiProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoDefiProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoDefiProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoDefiProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoDefiProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoDefiProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoDefiProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoDefiProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoDefiProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoDefiProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoDefiProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoDefiProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoDefiProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoDefiProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoDefiProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoDefiProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoDefiProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoDefiProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoDefiProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoDefiProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoDefiProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoDefiProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoDefiProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoDefiProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoDefiProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoDefiProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoDefiProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoDefiProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoDefiProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoDefiProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoDefiProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoDefiProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoDefiProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoDefiProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoDefiProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoDefiProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoDefiProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoDefiProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoDefiProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoDefiProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoDefiProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoDefiProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoDefiProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoDefiProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoDefiProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoDefiProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoDefiProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoDefiProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoDefiProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoDefiProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoDefiProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoDefiProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoDefiProdu.add(this.jMenuItemCerrarProductoDefiProdu);
			
			this.jmenuAccionesProductoDefiProdu.add(this.jMenuItemNuevoProductoDefiProdu);
			this.jmenuAccionesProductoDefiProdu.add(this.jMenuItemNuevoGuardarCambiosProductoDefiProdu);
			this.jmenuAccionesProductoDefiProdu.add(this.jMenuItemNuevoRelacionesProductoDefiProdu);
			this.jmenuAccionesProductoDefiProdu.add(this.jMenuItemGuardarCambiosTablaProductoDefiProdu);		
			this.jmenuAccionesProductoDefiProdu.add(this.jMenuItemDuplicarProductoDefiProdu);		
			this.jmenuAccionesProductoDefiProdu.add(this.jMenuItemCopiarProductoDefiProdu);		
			this.jmenuAccionesProductoDefiProdu.add(this.jMenuItemVerFormProductoDefiProdu);		
			
			this.jmenuDatosProductoDefiProdu.add(this.jMenuItemRecargarInformacionProductoDefiProdu);				
			this.jmenuDatosProductoDefiProdu.add(this.jMenuItemAnterioresProductoDefiProdu);				
			this.jmenuDatosProductoDefiProdu.add(this.jMenuItemSiguientesProductoDefiProdu);				
			this.jmenuDatosProductoDefiProdu.add(this.jMenuItemAbrirOrderByProductoDefiProdu);				
			this.jmenuDatosProductoDefiProdu.add(this.jMenuItemMostrarOcultarProductoDefiProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoDefiProdu.add(this.jMenuItemGuardarCambiosProductoDefiProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoDefiProdu.add(this.jmenuArchivoProductoDefiProdu);		
			this.jmenuBarProductoDefiProdu.add(this.jmenuAccionesProductoDefiProdu);		
			this.jmenuBarProductoDefiProdu.add(this.jmenuDatosProductoDefiProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoDefiProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoDefiProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasProductoDefiProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoDefiProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoDefiProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoDefiProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoDefiProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoDefiProdu = new ProductoDefiProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Definicion Produccion DATOS");
			this.jInternalFrameDetalleFormProductoDefiProdu = new ProductoDefiProduDetalleFormJInternalFrame(jDesktopPane,this.productodefiproduSessionBean.getConGuardarRelaciones(),this.productodefiproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoDefiProdu = null;//new ProductoDefiProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoDefiProdu= new GridBagLayout();
		
		
		this.jTableDatosProductoDefiProdu = new JTableMe();      
		
		String sToolTipProductoDefiProdu="";
		sToolTipProductoDefiProdu=ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoDefiProdu+="(Produccion.ProductoDefiProdu)";
		}
		
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoDefiProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoDefiProdu.setToolTipText(sToolTipProductoDefiProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoDefiProdu);
		this.jTableDatosProductoDefiProdu.setAutoCreateRowSorter(true);
		this.jTableDatosProductoDefiProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoDefiProdu.setRowSelectionAllowed(true);
		this.jTableDatosProductoDefiProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoDefiProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoDefiProdu = new JButtonMe();
		this.jButtonDuplicarProductoDefiProdu = new JButtonMe();
		this.jButtonCopiarProductoDefiProdu = new JButtonMe();
		this.jButtonVerFormProductoDefiProdu = new JButtonMe();
		this.jButtonNuevoRelacionesProductoDefiProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoDefiProdu = new JButtonMe();
		this.jButtonCerrarProductoDefiProdu = new JButtonMe();
		
		this.jScrollPanelDatosProductoDefiProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoDefiProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Definicion Produccion";
		
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Definicion Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoDefiProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoDefiProdu.setToolTipText("Acciones");
        this.jPanelAccionesProductoDefiProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoDefiProdu=new ReporteDinamicoJInternalFrame(ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoDefiProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoDefiProdu=new ImportacionJInternalFrame(ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoDefiProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoDefiProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoDefiProdu.setText("Orden");
		this.jButtonAbrirOrderByProductoDefiProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoDefiProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoDefiProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoDefiProdu,false,this);
			
			//this.cargarOrderByProductoDefiProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoDefiProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoDefiProdu,true,this);
			
			//this.cargarOrderByProductoDefiProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoDefiProdu.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosProductoDefiProdu.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosProductoDefiProdu.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosProductoDefiProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoDefiProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoDefiProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoDefiProdu.setText("Nuevo");
		this.jButtonDuplicarProductoDefiProdu.setText("Duplicar");
		this.jButtonCopiarProductoDefiProdu.setText("Copiar");
		this.jButtonVerFormProductoDefiProdu.setText("Ver");
		this.jButtonNuevoRelacionesProductoDefiProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoDefiProdu.setText("Guardar");
		this.jButtonCerrarProductoDefiProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoDefiProdu,"nuevo_button","Nuevo",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoDefiProdu,"duplicar_button","Duplicar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoDefiProdu,"copiar_button","Copiar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoDefiProdu,"ver_form","Ver",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoDefiProdu,"nuevorelaciones_button","Nuevo Rel",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoDefiProdu,"guardarcambiostabla_button","Guardar",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoDefiProdu,"cerrar_button","Salir",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoDefiProdu.setToolTipText("Nuevo"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoDefiProdu.setToolTipText("Duplicar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoDefiProdu.setToolTipText("Copiar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoDefiProdu.setToolTipText("Ver"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoDefiProdu.setToolTipText("Nuevo Rel"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoDefiProdu.setToolTipText("Guardar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoDefiProdu.setToolTipText("Salir"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoDefiProdu";
		inputMap = this.jButtonNuevoProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoDefiProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoDefiProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoDefiProdu";
		inputMap = this.jButtonDuplicarProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoDefiProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoDefiProdu"));
		
		//COPIAR
		sMapKey = "CopiarProductoDefiProdu";
		inputMap = this.jButtonCopiarProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoDefiProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoDefiProdu"));
		
		//VEr FORM
		sMapKey = "VerFormProductoDefiProdu";
		inputMap = this.jButtonVerFormProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoDefiProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoDefiProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoDefiProdu";
		inputMap = this.jButtonNuevoRelacionesProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoDefiProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoDefiProdu";
		inputMap = this.jButtonModificarProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoDefiProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoDefiProdu";
		inputMap = this.jButtonCerrarProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoDefiProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoDefiProdu";
		inputMap = this.jButtonGuardarCambiosTablaProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoDefiProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoDefiProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoDefiProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoDefiProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoDefiProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoDefiProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoDefiProdu.setName("jPanelParametrosReportesProductoDefiProdu"); 
		
		this.jPanelParametrosReportesAccionesProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoDefiProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoDefiProdu.setName("jPanelParametrosReportesAccionesProductoDefiProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoDefiProdu = new JButtonMe();
		this.jButtonRecargarInformacionProductoDefiProdu.setText("Recargar");
		this.jButtonRecargarInformacionProductoDefiProdu.setToolTipText("Recargar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoDefiProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoDefiProdu = new JButtonMe();
		this.jButtonProcesarInformacionProductoDefiProdu.setText("Procesar");
		this.jButtonProcesarInformacionProductoDefiProdu.setToolTipText("Procesar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoDefiProdu.setVisible(false);
			
		this.jButtonProcesarInformacionProductoDefiProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoDefiProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoDefiProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoDefiProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoDefiProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoDefiProdu.setText("TIPO");       
		this.jComboBoxTiposReportesProductoDefiProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoDefiProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoDefiProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoDefiProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoDefiProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoDefiProdu.setText("Accion");
		this.jComboBoxTiposRelacionesProductoDefiProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoDefiProdu.setText("Accion");
		this.jComboBoxTiposAccionesProductoDefiProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoDefiProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoDefiProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoDefiProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoDefiProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoDefiProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoDefiProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoDefiProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoDefiProdu = new JLabelMe();
		
		this.jLabelAccionesProductoDefiProdu.setText("Acciones");		
		this.jLabelAccionesProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoDefiProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoDefiProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoDefiProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoDefiProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoDefiProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoDefiProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoDefiProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoDefiProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoDefiProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoDefiProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoDefiProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoDefiProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoDefiProdu = new JButtonMe();
		//this.jButtonAnterioresProductoDefiProdu.setText("<<");
        this.jButtonAnterioresProductoDefiProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoDefiProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoDefiProdu = new JButtonMe();
		//this.jButtonSiguientesProductoDefiProdu.setText(">>");
        this.jButtonSiguientesProductoDefiProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoDefiProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoDefiProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoDefiProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoDefiProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoDefiProdu,"nuevoguardarcambios_button","Nue",this.productodefiproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoDefiProdu";
		inputMap = this.jButtonNuevoGuardarCambiosProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoDefiProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoDefiProdu";
		inputMap = this.jButtonRecargarInformacionProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoDefiProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoDefiProdu";
		inputMap = this.jButtonSiguientesProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoDefiProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoDefiProdu";
		inputMap = this.jButtonAnterioresProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoDefiProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoDefiProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoDefiProdu.setMinimumSize(new Dimension(this.getWidth(),ProductoDefiProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoDefiProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoDefiProdu.setMaximumSize(new Dimension(this.getWidth(),ProductoDefiProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoDefiProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoDefiProdu.setPreferredSize(new Dimension(this.getWidth(),ProductoDefiProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoDefiProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoDefiProdu = new GridBagLayout();

			this.jPanelPaginacionProductoDefiProdu.setLayout(gridaBagLayoutPaginacionProductoDefiProdu);						
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = 0;
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoDefiProdu.add(this.jButtonAnterioresProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
					
						
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoDefiProdu.gridy = 0;
			
			this.jPanelPaginacionProductoDefiProdu.add(this.jButtonNuevoGuardarCambiosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
						
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoDefiProdu.gridy = 0;
			this.jPanelPaginacionProductoDefiProdu.add(this.jButtonSiguientesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = 1;
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoDefiProdu.add(this.jButtonNuevoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoDefiProdu.gridy = 1;
				this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionProductoDefiProdu.add(this.jButtonNuevoRelacionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			}
			
			
			if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoDefiProdu.gridy = 1;
				this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoDefiProdu.add(this.jButtonGuardarCambiosTablaProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			}
			
			
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = 1;
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoDefiProdu.add(this.jButtonDuplicarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = 1;
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoDefiProdu.add(this.jButtonCopiarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = 1;
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoDefiProdu.add(this.jButtonVerFormProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = 1;
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoDefiProdu.add(this.jButtonCerrarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
		
		
		this.jButtonRecargarInformacionProductoDefiProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoDefiProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoDefiProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoDefiProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoDefiProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoDefiProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoDefiProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoDefiProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoDefiProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoDefiProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoDefiProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoDefiProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoDefiProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoDefiProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoDefiProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoDefiProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoDefiProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoDefiProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoDefiProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoDefiProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoDefiProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoDefiProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoDefiProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoDefiProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoDefiProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoDefiProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoDefiProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoDefiProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoDefiProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoDefiProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoDefiProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoDefiProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoDefiProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoDefiProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoDefiProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoDefiProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoDefiProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoDefiProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoDefiProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoDefiProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoDefiProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoDefiProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoDefiProdu.setLayout(gridaBagParametrosReportesProductoDefiProdu);
			this.jPanelParametrosReportesAccionesProductoDefiProdu.setLayout(gridaBagParametrosReportesAccionesProductoDefiProdu);
			
			
			this.jPanelParametrosAuxiliar1ProductoDefiProdu.setLayout(gridaBagParametrosAuxiliar1ProductoDefiProdu);
			this.jPanelParametrosAuxiliar2ProductoDefiProdu.setLayout(gridaBagParametrosAuxiliar2ProductoDefiProdu);
			this.jPanelParametrosAuxiliar3ProductoDefiProdu.setLayout(gridaBagParametrosAuxiliar3ProductoDefiProdu);
			this.jPanelParametrosAuxiliar4ProductoDefiProdu.setLayout(gridaBagParametrosAuxiliar4ProductoDefiProdu);
			//this.jPanelParametrosAuxiliar5ProductoDefiProdu.setLayout(gridaBagParametrosAuxiliar2ProductoDefiProdu);			
			
			
			
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jButtonRecargarInformacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoDefiProdu.add(this.jComboBoxTiposPaginacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoDefiProdu.add(this.jCheckBoxConAltoMaximoTablaProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoDefiProdu.add(this.jComboBoxTiposArchivosReportesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jPanelParametrosAuxiliar1ProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoDefiProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoDefiProdu.add(this.jComboBoxTiposReportesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jPanelParametrosAuxiliar4ProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jComboBoxTiposReportesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jCheckBoxGenerarReporteProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jPanelParametrosAuxiliar2ProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoDefiProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jLabelAccionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoDefiProdu.add(this.jButtonAbrirOrderByProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jComboBoxTiposSeleccionarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
			
			
			/*
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoDefiProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jCheckBoxSeleccionarTodosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoDefiProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoDefiProdu.add(this.jCheckBoxSeleccionarTodosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);															
				
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoDefiProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoDefiProdu.add(this.jCheckBoxSeleccionadosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jPanelParametrosAuxiliar3ProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jComboBoxTiposRelacionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
				
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jComboBoxTiposAccionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
	
				
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoDefiProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoDefiProdu.add(this.jTextFieldValorCampoGeneralProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoDefiProdu = new GridBagLayout();

			this.jScrollPanelDatosProductoDefiProdu.setLayout(gridaBagLayoutDatosProductoDefiProdu);
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = 0;
			this.gridBagConstraintsProductoDefiProdu.gridx = 0;
			
			this.jScrollPanelDatosProductoDefiProdu.add(this.jTableDatosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoDefiProdu.setViewportView(this.jTableDatosProductoDefiProdu);
		this.jTableDatosProductoDefiProdu.setFillsViewportHeight(true);
		this.jTableDatosProductoDefiProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoDefiProdu= new GridBagLayout();
		this.jPanelAccionesProductoDefiProdu.setLayout(gridaBagLayoutAccionesProductoDefiProdu);
		
		
		/*	
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = 0;
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;
			
		this.jPanelAccionesProductoDefiProdu.add(this.jButtonNuevoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoDefiProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoDefiProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();						
			this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoDefiProdu.gridx = 0;		
			//this.gridBagConstraintsProductoDefiProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoDefiProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;		
		//this.gridBagConstraintsProductoDefiProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoDefiProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoDefiProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);								
		
		
		/*
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		*/		
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoDefiProdu.gridx =0;
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoDefiProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
				
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoDefiProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoDefiProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoDefiProdu.setLayout(gridaBagLayoutBusquedasParametrosProductoDefiProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoDefiProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoDefiProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoDefiProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoDefiProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
			
			
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
			
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoDefiProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoDefiProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoDefiProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoDefiProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoDefiProdu.setName("jPanelReporteDinamicoProductoDefiProdu"); 
		
		this.jPanelReporteDinamicoProductoDefiProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoDefiProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoDefiProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoDefiProdu.setLayout(gridaBagLayoutReporteDinamicoProductoDefiProdu);
		
		
		this.jInternalFrameReporteDinamicoProductoDefiProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoDefiProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoDefiProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoDefiProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoDefiProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoDefiProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoDefiProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoDefiProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoDefiProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoDefiProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoDefiProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoDefiProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoDefiProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoDefiProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Definicion Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoDefiProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoDefiProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jLabelColumnasSelectReporteProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoDefiProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoDefiProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoDefiProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoDefiProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoDefiProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoDefiProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoDefiProdu=new JScrollPane(this.jListColumnasSelectReporteProductoDefiProdu);
			
			this.jScrollColumnasSelectReporteProductoDefiProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoDefiProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoDefiProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoDefiProdu.add(this.jListColumnasSelectReporteProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jScrollColumnasSelectReporteProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoDefiProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoDefiProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jLabelRelacionesSelectReporteProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoDefiProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoDefiProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoDefiProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoDefiProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoDefiProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoDefiProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoDefiProdu=new JScrollPane(this.jListRelacionesSelectReporteProductoDefiProdu);
			
			this.jScrollRelacionesSelectReporteProductoDefiProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoDefiProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoDefiProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoDefiProdu.add(this.jListRelacionesSelectReporteProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jScrollRelacionesSelectReporteProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoProductoDefiProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoDefiProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoDefiProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoDefiProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoDefiProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoDefiProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoDefiProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoDefiProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoDefiProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoDefiProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jLabelGenerarExcelReporteDinamicoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoDefiProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoDefiProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoDefiProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoDefiProdu.setToolTipText("Generar EXCEL"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoDefiProdu.add(this.jButtonGenerarExcelReporteDinamicoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jComboBoxTiposReportesDinamicoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoDefiProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoDefiProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jLabelTiposArchivoReporteDinamicoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jComboBoxTiposArchivosReportesDinamicoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoDefiProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoDefiProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoDefiProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoDefiProdu.setToolTipText("Generar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jButtonGenerarReporteDinamicoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoDefiProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoDefiProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoDefiProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoDefiProdu.setToolTipText("Cancelar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoDefiProdu.add(this.jButtonCerrarReporteDinamicoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoDefiProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoDefiProdu= new JScrollPane(jPanelReporteDinamicoProductoDefiProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoDefiProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoDefiProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoDefiProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Definicion Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoDefiProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoDefiProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoDefiProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoDefiProdu);
		this.jInternalFrameReporteDinamicoProductoDefiProdu.getContentPane().add(this.jScrollPanelReporteDinamicoProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoDefiProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoDefiProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoDefiProdu.setName("jPanelImportacionProductoDefiProdu"); 
		
		this.jPanelImportacionProductoDefiProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoDefiProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoDefiProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoDefiProdu.setLayout(gridaBagLayoutImportacionProductoDefiProdu);
		
		
		this.jInternalFrameImportacionProductoDefiProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoDefiProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoDefiProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoDefiProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoDefiProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoDefiProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoDefiProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoDefiProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoDefiProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoDefiProdu.setResizable(true);
	    this.jInternalFrameImportacionProductoDefiProdu.setClosable(true);
	    this.jInternalFrameImportacionProductoDefiProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoDefiProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoDefiProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoDefiProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoDefiProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoDefiProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoDefiProdu.setResizable(true);
	    this.jInternalFrameImportacionProductoDefiProdu.setClosable(true);
	    this.jInternalFrameImportacionProductoDefiProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoDefiProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoDefiProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoDefiProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Definicion Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoDefiProdu = new JLabelMe();

		this.jLabelArchivoImportacionProductoDefiProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoDefiProdu.add(this.jLabelArchivoImportacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoDefiProdu = new JFileChooser();		
		this.jFileChooserImportacionProductoDefiProdu.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoDefiProdu = new JButtonMe();
		this.jButtonAbrirImportacionProductoDefiProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoDefiProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoDefiProdu.setToolTipText("Generar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoDefiProdu.add(this.jButtonAbrirImportacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoDefiProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoDefiProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoDefiProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoDefiProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoDefiProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoDefiProdu.add(this.jLabelPathArchivoImportacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoDefiProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoDefiProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoDefiProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoDefiProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoDefiProdu.add(this.jTextFieldPathArchivoImportacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoDefiProdu = new JButtonMe();
		this.jButtonGenerarImportacionProductoDefiProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoDefiProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoDefiProdu.setToolTipText("Generar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoDefiProdu.add(this.jButtonGenerarImportacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoDefiProdu = new JButtonMe();
		this.jButtonCerrarImportacionProductoDefiProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoDefiProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoDefiProdu.setToolTipText("Cancelar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoDefiProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoDefiProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoDefiProdu.add(this.jButtonCerrarImportacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoDefiProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoDefiProdu= new JScrollPane(jPanelImportacionProductoDefiProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoDefiProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoDefiProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoDefiProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoDefiProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoDefiProdu);
		this.jInternalFrameImportacionProductoDefiProdu.getContentPane().add(this.jScrollPanelImportacionProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoDefiProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoDefiProdu = new JButtonMe();
			this.jButtonAbrirOrderByProductoDefiProdu.setText("Orden");
			this.jButtonAbrirOrderByProductoDefiProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoDefiProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoDefiProdu";
			inputMap = this.jButtonAbrirOrderByProductoDefiProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoDefiProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoDefiProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoDefiProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoDefiProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoDefiProdu.setName("jPanelOrderByProductoDefiProdu"); 
			
			this.jPanelOrderByProductoDefiProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoDefiProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoDefiProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoDefiProdu.setLayout(gridaBagLayoutOrderByProductoDefiProdu);
			
			
			this.jTableDatosProductoDefiProduOrderBy = new JTableMe();        
			this.jTableDatosProductoDefiProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoDefiProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoDefiProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoDefiProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoDefiProduOrderBy.setViewportView(this.jTableDatosProductoDefiProduOrderBy);
			this.jTableDatosProductoDefiProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoDefiProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoDefiProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoDefiProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoDefiProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoDefiProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoDefiProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoDefiProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoDefiProdu.setTitle("Orden");
			this.jInternalFrameOrderByProductoDefiProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoDefiProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoDefiProdu.setResizable(true);
			this.jInternalFrameOrderByProductoDefiProdu.setClosable(true);
			this.jInternalFrameOrderByProductoDefiProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoDefiProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoDefiProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoDefiProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoDefiProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Definicion Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoDefiProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoDefiProdu.ipady =150;
				
			this.jPanelOrderByProductoDefiProdu.add(jScrollPanelDatosProductoDefiProduOrderBy, this.gridBagConstraintsProductoDefiProdu);//this.jTableDatosProductoDefiProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoDefiProdu = new JButtonMe();
			this.jButtonCerrarOrderByProductoDefiProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoDefiProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoDefiProdu.setToolTipText("Cancelar"+" "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoDefiProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoDefiProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoDefiProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoDefiProdu.add(this.jButtonCerrarOrderByProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoDefiProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoDefiProdu= new JScrollPane(jPanelOrderByProductoDefiProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoDefiProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoDefiProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoDefiProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoDefiProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoDefiProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoDefiProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoDefiProdu);
			
			this.jInternalFrameOrderByProductoDefiProdu.getContentPane().add(this.jScrollPanelOrderByProductoDefiProdu, this.gridBagConstraintsProductoDefiProdu);			
		
		} else {
			this.jButtonAbrirOrderByProductoDefiProdu = new JButtonMe();
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
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productodefiproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoDefiProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoDefiProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoDefiProdu.getRowHeight();//ProductoDefiProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoDefiProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoDefiProdu.isSelected()) {
					iHeightTable=ProductoDefiProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoDefiProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoDefiProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoDefiProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoDefiProdu.isSelected()) {
					iHeightTable=ProductoDefiProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoDefiProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoDefiProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoDefiProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoDefiProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoDefiProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoDefiProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoDefiProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoDefiProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoDefiProdu!=null && this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoDefiProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoDefiProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoDefiProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoDefiProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoDefiProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoDefiProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productodefiproduLogic.getProductoDefiProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productodefiprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoDefiProdu> TraerProductoDefiProduBeans(List<ProductoDefiProdu> productodefiprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoDefiProdu productodefiprodu:productodefiprodus) {
					
				if(!(ProductoDefiProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoDefiProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productodefiprodu.setsDetalleGeneralEntityReporte(ProductoDefiProduConstantesFunciones.getProductoDefiProduDescripcion(productodefiprodu));
										
					productodefiprodu.setcon_genera_sub_productos_descripcion(ProductoDefiProduConstantesFunciones.getcon_genera_sub_productosDescripcion(productodefiprodu));	
					
					

					if(productodefiprodu.getProductoProduManos()!=null && Funciones.existeClass(classes,ProductoProduMano.class)) {
						try{productodefiprodu.setproductoprodumanosDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduManoJInternalFrame.TraerProductoProduManoBeans(productodefiprodu.getProductoProduManos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(productodefiprodu.getProductoProduMermas()!=null && Funciones.existeClass(classes,ProductoProduMerma.class)) {
						try{productodefiprodu.setproductoprodumermasDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduMermaJInternalFrame.TraerProductoProduMermaBeans(productodefiprodu.getProductoProduMermas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(productodefiprodu.getProductoProduGastos()!=null && Funciones.existeClass(classes,ProductoProduGasto.class)) {
						try{productodefiprodu.setproductoprodugastosDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduGastoJInternalFrame.TraerProductoProduGastoBeans(productodefiprodu.getProductoProduGastos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(productodefiprodu.getProductoProdus()!=null && Funciones.existeClass(classes,ProductoProdu.class)) {
						try{productodefiprodu.setproductoprodusDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduJInternalFrame.TraerProductoProduBeans(productodefiprodu.getProductoProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(productodefiprodu.getProductoProduMaquinas()!=null && Funciones.existeClass(classes,ProductoProduMaquina.class)) {
						try{productodefiprodu.setproductoprodumaquinasDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduMaquinaJInternalFrame.TraerProductoProduMaquinaBeans(productodefiprodu.getProductoProduMaquinas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//productodefiprodu.setsDetalleGeneralEntityReporte(productodefiprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//productodefiprodubeans.add(productodefiprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productodefiprodus;
    }
	//PARA REPORTES FIN
}
