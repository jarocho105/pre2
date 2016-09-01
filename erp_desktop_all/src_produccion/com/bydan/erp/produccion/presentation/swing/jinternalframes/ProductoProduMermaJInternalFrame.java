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
import com.bydan.erp.produccion.util.ProductoProduMermaConstantesFunciones;

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
public class ProductoProduMermaJInternalFrame extends ProductoProduMermaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoProduMerma;
	
	protected JMenuBar jmenuBarProductoProduMerma;
	
	protected JMenu jmenuProductoProduMerma;
	protected JMenu jmenuDatosProductoProduMerma;
	protected JMenu jmenuArchivoProductoProduMerma;
	protected JMenu jmenuAccionesProductoProduMerma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProduMerma;	
	protected GridBagConstraints gridBagConstraintsProductoProduMerma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoProduMermaDetalleFormJInternalFrame jInternalFrameDetalleFormProductoProduMerma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoProduMerma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoProduMerma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

	protected TipoMermaEmpresaBeanSwingJInternalFrame tipomermaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomermaempresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoProduMermaSessionBean productoprodumermaSessionBean;
		
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public TipoMermaEmpresaSessionBean tipomermaempresaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoProduMerma> productoprodumermas;		
	public List<ProductoProduMerma> productoprodumermasEliminados;	
	public List<ProductoProduMerma> productoprodumermasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoProduMerma;		
	protected JButton jButtonAbrirOrderByProductoProduMerma;
	
	
	//protected JPanel jPanelOrderByProductoProduMerma;
	//public JScrollPane jScrollPanelOrderByProductoProduMerma;	
	//protected JButton jButtonCerrarOrderByProductoProduMerma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoProduMermaLogic productoprodumermaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoProduMerma;
	public JScrollPane jScrollPanelDatosEdicionProductoProduMerma;
	public JScrollPane jScrollPanelDatosGeneralProductoProduMerma;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoProduMermaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoProduMerma;
	//public JScrollPane jScrollPanelImportacionProductoProduMerma;
	
	
	
	protected JPanel jPanelAccionesProductoProduMerma;
	
    protected JPanel jPanelPaginacionProductoProduMerma;
    protected JPanel jPanelParametrosReportesProductoProduMerma;
	protected JPanel jPanelParametrosReportesAccionesProductoProduMerma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoProduMerma;
	protected JPanel jPanelParametrosAuxiliar2ProductoProduMerma;
	protected JPanel jPanelParametrosAuxiliar3ProductoProduMerma;
	protected JPanel jPanelParametrosAuxiliar4ProductoProduMerma;
	//protected JPanel jPanelParametrosAuxiliar5ProductoProduMerma;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoProduMerma;
	//protected JPanel jPanelImportacionProductoProduMerma;
	
	
	public JTable jTableDatosProductoProduMerma;
	
	
	
	//public JTable jTableDatosProductoProduMermaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoProduMerma;
	protected JButton jButtonDuplicarProductoProduMerma;
	protected JButton jButtonCopiarProductoProduMerma;
	protected JButton jButtonVerFormProductoProduMerma;
	protected JButton jButtonNuevoRelacionesProductoProduMerma;
	protected JButton jButtonModificarProductoProduMerma;
	
    protected JButton jButtonGuardarCambiosTablaProductoProduMerma;
	protected JButton jButtonCerrarProductoProduMerma;
	
	
	protected JButton jButtonRecargarInformacionProductoProduMerma;
	protected JButton jButtonProcesarInformacionProductoProduMerma;
	
	
	protected JButton jButtonAnterioresProductoProduMerma;
	protected JButton jButtonSiguientesProductoProduMerma;
	protected JButton jButtonNuevoGuardarCambiosProductoProduMerma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoProduMerma;
	//protected JButton jButtonCerrarReporteDinamicoProductoProduMerma;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoProduMerma;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoProduMerma;
	//protected JButton jButtonGenerarImportacionProductoProduMerma;
	//protected JButton jButtonCerrarImportacionProductoProduMerma;
	//protected JFileChooser jFileChooserImportacionProductoProduMerma;
	//protected File fileImportacionProductoProduMerma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProduMerma;
	protected JButton jButtonDuplicarToolBarProductoProduMerma;
	protected JButton jButtonNuevoRelacionesToolBarProductoProduMerma;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoProduMerma;
	protected JButton jButtonCopiarToolBarProductoProduMerma;
	protected JButton jButtonVerFormToolBarProductoProduMerma;
	public JButton jButtonGuardarCambiosTablaToolBarProductoProduMerma;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProduMerma;
	protected JButton jButtonCerrarToolBarProductoProduMerma;
	
	protected JButton jButtonRecargarInformacionToolBarProductoProduMerma;
	protected JButton jButtonProcesarInformacionToolBarProductoProduMerma;
	protected JButton jButtonAnterioresToolBarProductoProduMerma;
	protected JButton jButtonSiguientesToolBarProductoProduMerma;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoProduMerma;
	protected JButton jButtonAbrirOrderByToolBarProductoProduMerma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProduMerma;
	protected JMenuItem jMenuItemDuplicarProductoProduMerma;
	protected JMenuItem jMenuItemNuevoRelacionesProductoProduMerma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoProduMerma;
	protected JMenuItem jMenuItemCopiarProductoProduMerma;
	protected JMenuItem jMenuItemVerFormProductoProduMerma;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProduMerma;
	protected JMenuItem jMenuItemCerrarProductoProduMerma;
	protected JMenuItem jMenuItemDetalleCerrarProductoProduMerma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoProduMerma;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProduMerma;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoProduMerma;
	protected JMenuItem jMenuItemProcesarInformacionProductoProduMerma;
	protected JMenuItem jMenuItemAnterioresProductoProduMerma;
	protected JMenuItem jMenuItemSiguientesProductoProduMerma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProduMerma;
	protected JMenuItem jMenuItemAbrirOrderByProductoProduMerma;
	protected JMenuItem jMenuItemMostrarOcultarProductoProduMerma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProduMerma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoProduMerma;
	protected JCheckBox jCheckBoxSeleccionadosProductoProduMerma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoProduMerma;
	protected JCheckBox jCheckBoxConGraficoReporteProductoProduMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoProduMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoProduMerma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProduMerma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoProduMerma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoProduMerma;
	protected JTextField jTextFieldValorCampoGeneralProductoProduMerma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoProduMerma;
	//public JList<Reporte> jListColumnasSelectReporteProductoProduMerma;
	//public JScrollPane jScrollColumnasSelectReporteProductoProduMerma;
	
	//public JLabel jLabelRelacionesSelectReporteProductoProduMerma;
	//public JList<Reporte> jListRelacionesSelectReporteProductoProduMerma;
	//public JScrollPane jScrollRelacionesSelectReporteProductoProduMerma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoProduMerma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoProduMerma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoProduMerma;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoProduMerma;
	
		
	//public JLabel jLabelArchivoImportacionProductoProduMerma;	
	//public JLabel jLabelPathArchivoImportacionProductoProduMerma;
	//protected JTextField jTextFieldPathArchivoImportacionProductoProduMerma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoProduMerma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoProduMerma;
	
	//public JLabel jLabelColumnaCategoriaValorProductoProduMerma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoProduMerma;
	
	//public JLabel jLabelColumnasValoresGraficoProductoProduMerma;
	//public JList<Reporte> jListColumnasValoresGraficoProductoProduMerma;
	//public JScrollPane jScrollColumnasValoresGraficoProductoProduMerma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoProduMerma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoProduMerma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoProduMerma;
	public JPanel jPanelFK_IdProductoDefiProduProductoProduMerma;
	public JButton jButtonFK_IdProductoDefiProduProductoProduMerma;
	public JPanel jPanelFK_IdTipoMermaEmpresaProductoProduMerma;
	public JButton jButtonFK_IdTipoMermaEmpresaProductoProduMerma;
	public JPanel jPanelFK_IdUnidadProductoProduMerma;
	public JButton jButtonFK_IdUnidadProductoProduMerma;
	
	public JPanel jPanelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma;
	public JLabel jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma;
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduMermaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma;
	public JLabel jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma;
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMermaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadProductoProduMerma;
	public JLabel jLabelid_unidadFK_IdUnidadProductoProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoProduMerma;
	public JButton jButtonid_unidadFK_IdUnidadProductoProduMerma= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoProduMermaBusqueda= new JButtonMe();

	
	
	
	
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
	public ProductoProduMermaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMermaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMermaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduMermaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoProduMerma)	{
		this.jButtonRecargarInformacionProductoProduMerma = jButtonRecargarInformacionProductoProduMerma;
	}
	
	public JButton getjButtonProcesarInformacionProductoProduMerma() {
		return this.jButtonProcesarInformacionProductoProduMerma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProduMerma)	{
		this.jButtonProcesarInformacionProductoProduMerma = jButtonProcesarInformacionProductoProduMerma;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoProduMerma() {
		return this.jButtonRecargarInformacionProductoProduMerma;
	}
	
	
	public List<ProductoProduMerma> getproductoprodumermas() {
		return this.productoprodumermas;
	}

	public void setproductoprodumermas(List<ProductoProduMerma> productoprodumermas) {
		this.productoprodumermas = productoprodumermas;
	}
	
	public List<ProductoProduMerma> getproductoprodumermasAux() {
		return this.productoprodumermasAux;
	}

	public void setproductoprodumermasAux(List<ProductoProduMerma> productoprodumermasAux) {
		this.productoprodumermasAux = productoprodumermasAux;
	}
	
	public List<ProductoProduMerma> getproductoprodumermasEliminados() {
		return this.productoprodumermasEliminados;
	}

	public void setProductoProduMermasEliminados(List<ProductoProduMerma> productoprodumermasEliminados) {
		this.productoprodumermasEliminados = productoprodumermasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoProduMerma() {
		return jComboBoxTiposSeleccionarProductoProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoProduMerma(
			JComboBox jComboBoxTiposSeleccionarProductoProduMerma) {
		this.jComboBoxTiposSeleccionarProductoProduMerma = jComboBoxTiposSeleccionarProductoProduMerma;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoProduMerma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoProduMerma() {
		return jTextFieldValorCampoGeneralProductoProduMerma;
	}

	public void setjTextFieldValorCampoGeneralProductoProduMerma(
			JTextField jTextFieldValorCampoGeneralProductoProduMerma) {
		this.jTextFieldValorCampoGeneralProductoProduMerma = jTextFieldValorCampoGeneralProductoProduMerma;
	}

	public void setBorderResaltarValorCampoGeneralProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoProduMerma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoProduMerma() {
		return this.jCheckBoxSeleccionarTodosProductoProduMerma;
	}

	public void setjCheckBoxSeleccionarTodosProductoProduMerma(
			JCheckBox jCheckBoxSeleccionarTodosProductoProduMerma) {
		this.jCheckBoxSeleccionarTodosProductoProduMerma = jCheckBoxSeleccionarTodosProductoProduMerma;
	}

	public void setBorderResaltarSeleccionarTodosProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoProduMerma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoProduMerma() {
		return this.jCheckBoxSeleccionadosProductoProduMerma;
	}

	public void setjCheckBoxSeleccionadosProductoProduMerma(
			JCheckBox jCheckBoxSeleccionadosProductoProduMerma) {
		this.jCheckBoxSeleccionadosProductoProduMerma = jCheckBoxSeleccionadosProductoProduMerma;
	}
	
	public void setBorderResaltarSeleccionadosProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoProduMerma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoProduMerma() {
		return this.jComboBoxTiposArchivosReportesProductoProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoProduMerma(
			JComboBox jComboBoxTiposArchivosReportesProductoProduMerma) {
		this.jComboBoxTiposArchivosReportesProductoProduMerma = jComboBoxTiposArchivosReportesProductoProduMerma;
	}

	public void setBorderResaltarTiposArchivosReportesProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoProduMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoProduMerma() {
		return this.jComboBoxTiposReportesProductoProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoProduMerma(
			JComboBox jComboBoxTiposReportesProductoProduMerma) {
		this.jComboBoxTiposReportesProductoProduMerma = jComboBoxTiposReportesProductoProduMerma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoProduMerma() {
	//	return jComboBoxTiposReportesDinamicoProductoProduMerma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoProduMerma(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoProduMerma) {
	//	this.jComboBoxTiposReportesDinamicoProductoProduMerma = jComboBoxTiposReportesDinamicoProductoProduMerma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoProduMerma() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoProduMerma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoProduMerma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProduMerma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoProduMerma = jComboBoxTiposArchivosReportesDinamicoProductoProduMerma;
	//}
	
	public void setBorderResaltarTiposReportesProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoProduMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoProduMerma() {
		return this.jComboBoxTiposGraficosReportesProductoProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoProduMerma(
			JComboBox jComboBoxTiposGraficosReportesProductoProduMerma) {
		this.jComboBoxTiposGraficosReportesProductoProduMerma = jComboBoxTiposGraficosReportesProductoProduMerma;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoProduMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoProduMerma() {
		return this.jComboBoxTiposPaginacionProductoProduMerma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoProduMerma(
			JComboBox jComboBoxTiposPaginacionProductoProduMerma) {
		this.jComboBoxTiposPaginacionProductoProduMerma = jComboBoxTiposPaginacionProductoProduMerma;
	}
	
	public void setBorderResaltarTiposPaginacionProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoProduMerma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoProduMerma() {
		return this.jComboBoxTiposRelacionesProductoProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProduMerma() {
		return this.jComboBoxTiposAccionesProductoProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProduMerma(
			JComboBox jComboBoxTiposRelacionesProductoProduMerma) {
		this.jComboBoxTiposRelacionesProductoProduMerma = jComboBoxTiposRelacionesProductoProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProduMerma(
			JComboBox jComboBoxTiposAccionesProductoProduMerma) {
		this.jComboBoxTiposAccionesProductoProduMerma = jComboBoxTiposAccionesProductoProduMerma;
	}
	
	public void setBorderResaltarTiposRelacionesProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoProduMerma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoProduMerma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoProduMerma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoProduMerma() {
	//	return jCheckBoxConGraficoDinamicoProductoProduMerma;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoProduMerma(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoProduMerma) {
	//	this.jCheckBoxConGraficoDinamicoProductoProduMerma = jCheckBoxConGraficoDinamicoProductoProduMerma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoProduMerma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoProduMerma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoProduMerma .setBorder(borderResaltar);		
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
		this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
		
		this.productoprodumermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoprodumermaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduMermaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Merma Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoProduMerma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"nuevo","nuevo","Nuevo"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"duplicar","duplicar","Duplicar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"copiar","copiar","Copiar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"ver_form","ver_form","Ver"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"recargar","recargar","Recargar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoProduMerma,this.jTtoolBarProductoProduMerma,
							"cerrar","cerrar","Salir"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoProduMerma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoProduMerma;
			
				this.jButtonProcesarInformacionToolBarProductoProduMerma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoProduMerma;
				
		//protected JButton jButtonModificarToolBarProductoProduMerma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoProduMerma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoProduMerma=new JMenuMe("General");
		this.jmenuArchivoProductoProduMerma=new JMenuMe("Archivo");
		this.jmenuAccionesProductoProduMerma=new JMenuMe("Acciones");
		this.jmenuDatosProductoProduMerma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProduMerma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProduMerma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProduMerma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoProduMerma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoProduMerma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoProduMerma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoProduMerma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoProduMerma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoProduMerma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoProduMerma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProduMerma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProduMerma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoProduMerma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoProduMerma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoProduMerma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoProduMerma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoProduMerma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoProduMerma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoProduMerma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoProduMerma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoProduMerma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProduMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProduMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProduMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoProduMerma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoProduMerma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoProduMerma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoProduMerma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoProduMerma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoProduMerma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoProduMerma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoProduMerma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoProduMerma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoProduMerma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoProduMerma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoProduMerma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoProduMerma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoProduMerma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoProduMerma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProduMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProduMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProduMerma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoProduMerma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoProduMerma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoProduMerma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProduMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProduMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProduMerma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoProduMerma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoProduMerma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoProduMerma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoProduMerma.add(this.jMenuItemCerrarProductoProduMerma);
			
			this.jmenuAccionesProductoProduMerma.add(this.jMenuItemNuevoProductoProduMerma);
			this.jmenuAccionesProductoProduMerma.add(this.jMenuItemNuevoGuardarCambiosProductoProduMerma);
			this.jmenuAccionesProductoProduMerma.add(this.jMenuItemNuevoRelacionesProductoProduMerma);
			this.jmenuAccionesProductoProduMerma.add(this.jMenuItemGuardarCambiosTablaProductoProduMerma);		
			this.jmenuAccionesProductoProduMerma.add(this.jMenuItemDuplicarProductoProduMerma);		
			this.jmenuAccionesProductoProduMerma.add(this.jMenuItemCopiarProductoProduMerma);		
			this.jmenuAccionesProductoProduMerma.add(this.jMenuItemVerFormProductoProduMerma);		
			
			this.jmenuDatosProductoProduMerma.add(this.jMenuItemRecargarInformacionProductoProduMerma);				
			this.jmenuDatosProductoProduMerma.add(this.jMenuItemAnterioresProductoProduMerma);				
			this.jmenuDatosProductoProduMerma.add(this.jMenuItemSiguientesProductoProduMerma);				
			this.jmenuDatosProductoProduMerma.add(this.jMenuItemAbrirOrderByProductoProduMerma);				
			this.jmenuDatosProductoProduMerma.add(this.jMenuItemMostrarOcultarProductoProduMerma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoProduMerma.add(this.jMenuItemGuardarCambiosProductoProduMerma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoProduMerma.add(this.jmenuArchivoProductoProduMerma);		
			this.jmenuBarProductoProduMerma.add(this.jmenuAccionesProductoProduMerma);		
			this.jmenuBarProductoProduMerma.add(this.jmenuDatosProductoProduMerma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoProduMerma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoProduMerma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdProductoDefiProduProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDefiProduProductoProduMerma.setToolTipText("Buscar Por Producto Defi Produ ");
		this.jButtonFK_IdProductoDefiProduProductoProduMerma= new JButtonMe();
		this.jButtonFK_IdProductoDefiProduProductoProduMerma.setText("Buscar");
		this.jButtonFK_IdProductoDefiProduProductoProduMerma.setToolTipText("Buscar Por Producto Defi Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDefiProduProductoProduMerma,"buscar_button","Buscar Por Producto Defi Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDefiProduProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma = new JLabelMe();
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setText("Producto Defi Produ :");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setToolTipText("Producto Defi Produ");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma= new JComboBoxMe();
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMermaEmpresaProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMermaEmpresaProductoProduMerma.setToolTipText("Buscar Por Tipo Merma Empresa ");
		this.jButtonFK_IdTipoMermaEmpresaProductoProduMerma= new JButtonMe();
		this.jButtonFK_IdTipoMermaEmpresaProductoProduMerma.setText("Buscar");
		this.jButtonFK_IdTipoMermaEmpresaProductoProduMerma.setToolTipText("Buscar Por Tipo Merma Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMermaEmpresaProductoProduMerma,"buscar_button","Buscar Por Tipo Merma Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMermaEmpresaProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma = new JLabelMe();
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setText("Tipo Merma Empresa :");
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setToolTipText("Tipo Merma Empresa");
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma= new JComboBoxMe();
		jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadProductoProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoProduMerma.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoProduMerma= new JButtonMe();
		this.jButtonFK_IdUnidadProductoProduMerma.setText("Buscar");
		this.jButtonFK_IdUnidadProductoProduMerma.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoProduMerma,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoProduMerma = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoProduMerma.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoProduMerma.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoProduMerma= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoProduMerma=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoProduMerma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProduMerma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProduMerma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoProduMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoProduMerma = new ProductoProduMermaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Merma Produccion DATOS");
			this.jInternalFrameDetalleFormProductoProduMerma = new ProductoProduMermaDetalleFormJInternalFrame(jDesktopPane,this.productoprodumermaSessionBean.getConGuardarRelaciones(),this.productoprodumermaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoProduMerma = null;//new ProductoProduMermaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProduMerma= new GridBagLayout();
		
		
		this.jTableDatosProductoProduMerma = new JTableMe();      
		
		String sToolTipProductoProduMerma="";
		sToolTipProductoProduMerma=ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProduMerma+="(Produccion.ProductoProduMerma)";
		}
		
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProduMerma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoProduMerma.setToolTipText(sToolTipProductoProduMerma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoProduMerma);
		this.jTableDatosProductoProduMerma.setAutoCreateRowSorter(true);
		this.jTableDatosProductoProduMerma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoProduMerma.setRowSelectionAllowed(true);
		this.jTableDatosProductoProduMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoProduMerma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoProduMerma = new JButtonMe();
		this.jButtonDuplicarProductoProduMerma = new JButtonMe();
		this.jButtonCopiarProductoProduMerma = new JButtonMe();
		this.jButtonVerFormProductoProduMerma = new JButtonMe();
		this.jButtonNuevoRelacionesProductoProduMerma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoProduMerma = new JButtonMe();
		this.jButtonCerrarProductoProduMerma = new JButtonMe();
		
		this.jScrollPanelDatosProductoProduMerma = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoProduMerma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Merma Produccion";
		
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Merma Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProduMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProduMerma.setToolTipText("Acciones");
        this.jPanelAccionesProductoProduMerma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoProduMerma=new ReporteDinamicoJInternalFrame(ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoProduMerma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoProduMerma=new ImportacionJInternalFrame(ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoProduMerma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoProduMerma = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoProduMerma.setText("Orden");
		this.jButtonAbrirOrderByProductoProduMerma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProduMerma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProduMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMerma,false,this);
			
			//this.cargarOrderByProductoProduMerma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProduMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMerma,true,this);
			
			//this.cargarOrderByProductoProduMerma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoProduMerma.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosProductoProduMerma.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosProductoProduMerma.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosProductoProduMerma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProduMerma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProduMerma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoProduMerma.setText("Nuevo");
		this.jButtonDuplicarProductoProduMerma.setText("Duplicar");
		this.jButtonCopiarProductoProduMerma.setText("Copiar");
		this.jButtonVerFormProductoProduMerma.setText("Ver");
		this.jButtonNuevoRelacionesProductoProduMerma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoProduMerma.setText("Guardar");
		this.jButtonCerrarProductoProduMerma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProduMerma,"nuevo_button","Nuevo",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoProduMerma,"duplicar_button","Duplicar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoProduMerma,"copiar_button","Copiar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoProduMerma,"ver_form","Ver",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoProduMerma,"nuevorelaciones_button","Nuevo Rel",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProduMerma,"guardarcambiostabla_button","Guardar",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProduMerma,"cerrar_button","Salir",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoProduMerma.setToolTipText("Nuevo"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoProduMerma.setToolTipText("Duplicar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoProduMerma.setToolTipText("Copiar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoProduMerma.setToolTipText("Ver"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoProduMerma.setToolTipText("Nuevo Rel"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoProduMerma.setToolTipText("Guardar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProduMerma.setToolTipText("Salir"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProduMerma";
		inputMap = this.jButtonNuevoProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProduMerma"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoProduMerma";
		inputMap = this.jButtonDuplicarProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoProduMerma"));
		
		//COPIAR
		sMapKey = "CopiarProductoProduMerma";
		inputMap = this.jButtonCopiarProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoProduMerma"));
		
		//VEr FORM
		sMapKey = "VerFormProductoProduMerma";
		inputMap = this.jButtonVerFormProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoProduMerma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoProduMerma";
		inputMap = this.jButtonNuevoRelacionesProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoProduMerma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoProduMerma";
		inputMap = this.jButtonModificarProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoProduMerma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoProduMerma";
		inputMap = this.jButtonCerrarProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProduMerma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProduMerma";
		inputMap = this.jButtonGuardarCambiosTablaProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProduMerma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoProduMerma.setName("jPanelParametrosReportesProductoProduMerma"); 
		
		this.jPanelParametrosReportesAccionesProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoProduMerma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoProduMerma.setName("jPanelParametrosReportesAccionesProductoProduMerma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoProduMerma = new JButtonMe();
		this.jButtonRecargarInformacionProductoProduMerma.setText("Recargar");
		this.jButtonRecargarInformacionProductoProduMerma.setToolTipText("Recargar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoProduMerma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoProduMerma = new JButtonMe();
		this.jButtonProcesarInformacionProductoProduMerma.setText("Procesar");
		this.jButtonProcesarInformacionProductoProduMerma.setToolTipText("Procesar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoProduMerma.setVisible(false);
			
		this.jButtonProcesarInformacionProductoProduMerma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProduMerma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProduMerma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMerma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoProduMerma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMerma.setText("TIPO");       
		this.jComboBoxTiposReportesProductoProduMerma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduMerma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoProduMerma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoProduMerma.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoProduMerma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoProduMerma.setText("Accion");
		this.jComboBoxTiposRelacionesProductoProduMerma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProduMerma.setText("Accion");
		this.jComboBoxTiposAccionesProductoProduMerma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoProduMerma.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoProduMerma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoProduMerma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoProduMerma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProduMerma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProduMerma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoProduMerma = new JLabelMe();
		
		this.jLabelAccionesProductoProduMerma.setText("Acciones");		
		this.jLabelAccionesProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoProduMerma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoProduMerma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoProduMerma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoProduMerma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoProduMerma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoProduMerma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoProduMerma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoProduMerma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoProduMerma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoProduMerma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoProduMerma.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoProduMerma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoProduMerma = new JButtonMe();
		//this.jButtonAnterioresProductoProduMerma.setText("<<");
        this.jButtonAnterioresProductoProduMerma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoProduMerma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoProduMerma = new JButtonMe();
		//this.jButtonSiguientesProductoProduMerma.setText(">>");
        this.jButtonSiguientesProductoProduMerma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoProduMerma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoProduMerma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoProduMerma.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoProduMerma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoProduMerma,"nuevoguardarcambios_button","Nue",this.productoprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoProduMerma";
		inputMap = this.jButtonNuevoGuardarCambiosProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoProduMerma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoProduMerma";
		inputMap = this.jButtonRecargarInformacionProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoProduMerma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoProduMerma";
		inputMap = this.jButtonSiguientesProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoProduMerma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoProduMerma";
		inputMap = this.jButtonAnterioresProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoProduMerma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoProduMerma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoProduMerma.setMinimumSize(new Dimension(this.getWidth(),ProductoProduMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduMermaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProduMerma.setMaximumSize(new Dimension(this.getWidth(),ProductoProduMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduMermaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProduMerma.setPreferredSize(new Dimension(this.getWidth(),ProductoProduMermaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduMermaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoProduMerma = new GridBagLayout();

			this.jPanelPaginacionProductoProduMerma.setLayout(gridaBagLayoutPaginacionProductoProduMerma);						
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = 0;
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoProduMerma.add(this.jButtonAnterioresProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
					
						
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProduMerma.gridy = 0;
			
			this.jPanelPaginacionProductoProduMerma.add(this.jButtonNuevoGuardarCambiosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
						
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProduMerma.gridy = 0;
			this.jPanelPaginacionProductoProduMerma.add(this.jButtonSiguientesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = 1;
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMerma.add(this.jButtonNuevoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
						
			
			
			if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoProduMerma.gridy = 1;
				this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoProduMerma.add(this.jButtonGuardarCambiosTablaProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			}
			
			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = 1;
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMerma.add(this.jButtonDuplicarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = 1;
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMerma.add(this.jButtonCopiarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = 1;
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduMerma.add(this.jButtonVerFormProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = 1;
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoProduMerma.add(this.jButtonCerrarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		
		
		this.jButtonRecargarInformacionProductoProduMerma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProduMerma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProduMerma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoProduMerma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProduMerma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProduMerma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoProduMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProduMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProduMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoProduMerma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProduMerma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProduMerma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoProduMerma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProduMerma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProduMerma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoProduMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProduMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProduMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoProduMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoProduMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProduMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProduMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoProduMerma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProduMerma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProduMerma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoProduMerma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProduMerma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProduMerma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoProduMerma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProduMerma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProduMerma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoProduMerma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProduMerma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProduMerma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoProduMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoProduMerma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoProduMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoProduMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoProduMerma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoProduMerma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoProduMerma.setLayout(gridaBagParametrosReportesProductoProduMerma);
			this.jPanelParametrosReportesAccionesProductoProduMerma.setLayout(gridaBagParametrosReportesAccionesProductoProduMerma);
			
			
			this.jPanelParametrosAuxiliar1ProductoProduMerma.setLayout(gridaBagParametrosAuxiliar1ProductoProduMerma);
			this.jPanelParametrosAuxiliar2ProductoProduMerma.setLayout(gridaBagParametrosAuxiliar2ProductoProduMerma);
			this.jPanelParametrosAuxiliar3ProductoProduMerma.setLayout(gridaBagParametrosAuxiliar3ProductoProduMerma);
			this.jPanelParametrosAuxiliar4ProductoProduMerma.setLayout(gridaBagParametrosAuxiliar4ProductoProduMerma);
			//this.jPanelParametrosAuxiliar5ProductoProduMerma.setLayout(gridaBagParametrosAuxiliar2ProductoProduMerma);			
			
			
			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMerma.add(this.jButtonRecargarInformacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMerma.add(this.jComboBoxTiposPaginacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMerma.add(this.jCheckBoxConAltoMaximoTablaProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduMerma.add(this.jComboBoxTiposArchivosReportesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMerma.add(this.jPanelParametrosAuxiliar1ProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoProduMerma.add(this.jComboBoxTiposReportesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);																		
			
			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoProduMerma.add(this.jComboBoxTiposGraficosReportesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMerma.add(this.jPanelParametrosAuxiliar4ProductoProduMerma, this.gridBagConstraintsProductoProduMerma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMerma.add(this.jComboBoxTiposReportesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMerma.add(this.jCheckBoxGenerarReporteProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMerma.add(this.jPanelParametrosAuxiliar2ProductoProduMerma, this.gridBagConstraintsProductoProduMerma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMerma.add(this.jLabelAccionesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoProduMerma.add(this.jButtonAbrirOrderByProductoProduMerma, this.gridBagConstraintsProductoProduMerma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMerma.add(this.jComboBoxTiposSeleccionarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
			
			
			/*
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMerma.add(this.jCheckBoxSeleccionarTodosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduMerma.add(this.jCheckBoxConGraficoReporteProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMerma.add(this.jCheckBoxSeleccionarTodosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);															
				
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMerma.add(this.jCheckBoxSeleccionadosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);															
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduMerma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduMerma.add(this.jCheckBoxConGraficoReporteProductoProduMerma, this.gridBagConstraintsProductoProduMerma);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduMerma.add(this.jPanelParametrosAuxiliar3ProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMerma.add(this.jComboBoxTiposAccionesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
	
				
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduMerma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduMerma.add(this.jTextFieldValorCampoGeneralProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoProduMerma = new GridBagLayout();

			this.jScrollPanelDatosProductoProduMerma.setLayout(gridaBagLayoutDatosProductoProduMerma);
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = 0;
			this.gridBagConstraintsProductoProduMerma.gridx = 0;
			
			this.jScrollPanelDatosProductoProduMerma.add(this.jTableDatosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoProduMerma.setViewportView(this.jTableDatosProductoProduMerma);
		this.jTableDatosProductoProduMerma.setFillsViewportHeight(true);
		this.jTableDatosProductoProduMerma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoProduMerma= new GridBagLayout();
		this.jPanelAccionesProductoProduMerma.setLayout(gridaBagLayoutAccionesProductoProduMerma);
		
		
		/*	
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = 0;
		this.gridBagConstraintsProductoProduMerma.gridx = 0;
			
		this.jPanelAccionesProductoProduMerma.add(this.jButtonNuevoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdProductoDefiProduProductoProduMerma= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMerma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMerma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMerma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduMerma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDefiProduProductoProduMerma.setLayout(gridaBagLayoutFK_IdProductoDefiProduProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 0;
		gridBagConstraintsProductoProduMerma.gridx = 0;
		jPanelFK_IdProductoDefiProduProductoProduMerma.add(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma, gridBagConstraintsProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 0;
		gridBagConstraintsProductoProduMerma.gridx = 1;
		jPanelFK_IdProductoDefiProduProductoProduMerma.add(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma, gridBagConstraintsProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 1;
		gridBagConstraintsProductoProduMerma.gridx =1;
		jPanelFK_IdProductoDefiProduProductoProduMerma.add(jButtonFK_IdProductoDefiProduProductoProduMerma, gridBagConstraintsProductoProduMerma);

		jTabbedPaneBusquedasProductoProduMerma.addTab("1.-Por Producto Defi Produ ", jPanelFK_IdProductoDefiProduProductoProduMerma);
		jTabbedPaneBusquedasProductoProduMerma.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoMermaEmpresaProductoProduMerma= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMermaEmpresaProductoProduMerma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMermaEmpresaProductoProduMerma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMermaEmpresaProductoProduMerma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMermaEmpresaProductoProduMerma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMermaEmpresaProductoProduMerma.setLayout(gridaBagLayoutFK_IdTipoMermaEmpresaProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 0;
		gridBagConstraintsProductoProduMerma.gridx = 0;
		jPanelFK_IdTipoMermaEmpresaProductoProduMerma.add(jLabelid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma, gridBagConstraintsProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 0;
		gridBagConstraintsProductoProduMerma.gridx = 1;
		jPanelFK_IdTipoMermaEmpresaProductoProduMerma.add(jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma, gridBagConstraintsProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 1;
		gridBagConstraintsProductoProduMerma.gridx =1;
		jPanelFK_IdTipoMermaEmpresaProductoProduMerma.add(jButtonFK_IdTipoMermaEmpresaProductoProduMerma, gridBagConstraintsProductoProduMerma);

		jTabbedPaneBusquedasProductoProduMerma.addTab("2.-Por Tipo Merma Empresa ", jPanelFK_IdTipoMermaEmpresaProductoProduMerma);
		jTabbedPaneBusquedasProductoProduMerma.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoProduMerma= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoProduMerma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoProduMerma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoProduMerma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoProduMerma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoProduMerma.setLayout(gridaBagLayoutFK_IdUnidadProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 0;
		gridBagConstraintsProductoProduMerma.gridx = 0;
		jPanelFK_IdUnidadProductoProduMerma.add(jLabelid_unidadFK_IdUnidadProductoProduMerma, gridBagConstraintsProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 0;
		gridBagConstraintsProductoProduMerma.gridx = 1;
		jPanelFK_IdUnidadProductoProduMerma.add(jComboBoxid_unidadFK_IdUnidadProductoProduMerma, gridBagConstraintsProductoProduMerma);

		gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduMerma.gridy = 1;
		gridBagConstraintsProductoProduMerma.gridx =1;
		jPanelFK_IdUnidadProductoProduMerma.add(jButtonFK_IdUnidadProductoProduMerma, gridBagConstraintsProductoProduMerma);

		jTabbedPaneBusquedasProductoProduMerma.addTab("3.-Por Unad ", jPanelFK_IdUnidadProductoProduMerma);
		jTabbedPaneBusquedasProductoProduMerma.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProduMerma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProduMerma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();						
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMerma.gridx = 0;		
			//this.gridBagConstraintsProductoProduMerma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProduMerma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoProduMerma, this.gridBagConstraintsProductoProduMerma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMerma.gridx = 0;		
		//this.gridBagConstraintsProductoProduMerma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoProduMerma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoProduMerma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMerma.gridx = 0;		
			this.gridBagConstraintsProductoProduMerma.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoProduMerma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoProduMerma, this.gridBagConstraintsProductoProduMerma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);								
		
		
		/*
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		*/		
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMerma.gridx =0;
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProduMerma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
				
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoProduMerma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProduMerma = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoProduMerma.setLayout(gridaBagLayoutBusquedasParametrosProductoProduMerma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoProduMerma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProduMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
			
			
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
			
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMerma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoProduMerma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoProduMerma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoProduMerma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoProduMerma.setName("jPanelReporteDinamicoProductoProduMerma"); 
		
		this.jPanelReporteDinamicoProductoProduMerma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProduMerma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProduMerma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoProduMerma.setLayout(gridaBagLayoutReporteDinamicoProductoProduMerma);
		
		
		this.jInternalFrameReporteDinamicoProductoProduMerma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoProduMerma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProduMerma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoProduMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoProduMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoProduMerma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoProduMerma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoProduMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoProduMerma.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoProduMerma.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoProduMerma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoProduMerma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProduMerma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProduMerma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Merma Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoProduMerma = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoProduMerma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jLabelColumnasSelectReporteProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoProduMerma = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoProduMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoProduMerma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoProduMerma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProduMerma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProduMerma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoProduMerma=new JScrollPane(this.jListColumnasSelectReporteProductoProduMerma);
			
			this.jScrollColumnasSelectReporteProductoProduMerma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProduMerma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProduMerma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoProduMerma.add(this.jListColumnasSelectReporteProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jScrollColumnasSelectReporteProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoProduMerma = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoProduMerma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoProduMerma = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoProduMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoProduMerma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoProduMerma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProduMerma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProduMerma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoProduMerma=new JScrollPane(this.jListRelacionesSelectReporteProductoProduMerma);
			
			this.jScrollRelacionesSelectReporteProductoProduMerma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProduMerma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProduMerma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoProduMerma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoProduMerma = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoProduMerma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoProduMerma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoProduMerma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoProduMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProduMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProduMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMerma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMerma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMerma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMerma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduMerma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoProduMerma = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoProduMerma.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jLabelConGraficoDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoProduMerma = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoProduMerma.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoProduMerma.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoProduMerma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProduMerma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProduMerma.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jCheckBoxConGraficoDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoProduMerma = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoProduMerma.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jLabelColumnaCategoriaGraficoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProduMerma.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoProduMerma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoProduMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProduMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProduMerma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jComboBoxColumnaCategoriaGraficoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoProduMerma = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoProduMerma.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jLabelColumnaCategoriaValorProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoProduMerma.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoProduMerma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoProduMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProduMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProduMerma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jComboBoxColumnaCategoriaValorProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoProduMerma = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoProduMerma.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jLabelColumnasValoresGraficoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoProduMerma = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoProduMerma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoProduMerma.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoProduMerma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProduMerma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProduMerma.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoProduMerma=new JScrollPane(this.jListColumnasValoresGraficoProductoProduMerma);
			
			this.jScrollColumnasValoresGraficoProductoProduMerma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProduMerma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProduMerma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoProduMerma.add(this.jListColumnasSelectReporteProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jScrollColumnasValoresGraficoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoProduMerma = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoProduMerma.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jLabelTiposGraficosReportesDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoProduMerma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProduMerma.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMerma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoProduMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduMerma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jComboBoxTiposGraficosReportesDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoProduMerma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoProduMerma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jLabelGenerarExcelReporteDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMerma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoProduMerma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoProduMerma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMerma.setToolTipText("Generar EXCEL"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoProduMerma.add(this.jButtonGenerarExcelReporteDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jComboBoxTiposReportesDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoProduMerma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoProduMerma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jLabelTiposArchivoReporteDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jComboBoxTiposArchivosReportesDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoProduMerma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoProduMerma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoProduMerma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoProduMerma.setToolTipText("Generar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jButtonGenerarReporteDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoProduMerma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoProduMerma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoProduMerma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoProduMerma.setToolTipText("Cancelar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduMerma.add(this.jButtonCerrarReporteDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoProduMerma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoProduMerma= new JScrollPane(jPanelReporteDinamicoProductoProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoProduMerma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProduMerma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProduMerma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Merma Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduMerma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoProduMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoProduMerma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoProduMerma);
		this.jInternalFrameReporteDinamicoProductoProduMerma.getContentPane().add(this.jScrollPanelReporteDinamicoProductoProduMerma, this.gridBagConstraintsProductoProduMerma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoProduMerma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoProduMerma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoProduMerma.setName("jPanelImportacionProductoProduMerma"); 
		
		this.jPanelImportacionProductoProduMerma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProduMerma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProduMerma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoProduMerma.setLayout(gridaBagLayoutImportacionProductoProduMerma);
		
		
		this.jInternalFrameImportacionProductoProduMerma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoProduMerma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoProduMerma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProduMerma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoProduMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProduMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProduMerma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoProduMerma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProduMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProduMerma.setResizable(true);
	    this.jInternalFrameImportacionProductoProduMerma.setClosable(true);
	    this.jInternalFrameImportacionProductoProduMerma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoProduMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProduMerma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProduMerma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoProduMerma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProduMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProduMerma.setResizable(true);
	    this.jInternalFrameImportacionProductoProduMerma.setClosable(true);
	    this.jInternalFrameImportacionProductoProduMerma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoProduMerma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProduMerma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProduMerma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Merma Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoProduMerma = new JLabelMe();

		this.jLabelArchivoImportacionProductoProduMerma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProduMerma.add(this.jLabelArchivoImportacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoProduMerma = new JFileChooser();		
		this.jFileChooserImportacionProductoProduMerma.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoProduMerma = new JButtonMe();
		this.jButtonAbrirImportacionProductoProduMerma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoProduMerma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoProduMerma.setToolTipText("Generar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMerma.add(this.jButtonAbrirImportacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoProduMerma = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoProduMerma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProduMerma.add(this.jLabelPathArchivoImportacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoProduMerma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoProduMerma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProduMerma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProduMerma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMerma.add(this.jTextFieldPathArchivoImportacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoProduMerma = new JButtonMe();
		this.jButtonGenerarImportacionProductoProduMerma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoProduMerma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoProduMerma.setToolTipText("Generar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMerma.add(this.jButtonGenerarImportacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoProduMerma = new JButtonMe();
		this.jButtonCerrarImportacionProductoProduMerma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoProduMerma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoProduMerma.setToolTipText("Cancelar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMerma.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduMerma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduMerma.add(this.jButtonCerrarImportacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoProduMerma = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoProduMerma= new JScrollPane(jPanelImportacionProductoProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMerma.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoProduMerma.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoProduMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoProduMerma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoProduMerma);
		this.jInternalFrameImportacionProductoProduMerma.getContentPane().add(this.jScrollPanelImportacionProductoProduMerma, this.gridBagConstraintsProductoProduMerma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoProduMerma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoProduMerma = new JButtonMe();
			this.jButtonAbrirOrderByProductoProduMerma.setText("Orden");
			this.jButtonAbrirOrderByProductoProduMerma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProduMerma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoProduMerma";
			inputMap = this.jButtonAbrirOrderByProductoProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoProduMerma"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoProduMerma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoProduMerma.setName("jPanelOrderByProductoProduMerma"); 
			
			this.jPanelOrderByProductoProduMerma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProduMerma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProduMerma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoProduMerma.setLayout(gridaBagLayoutOrderByProductoProduMerma);
			
			
			this.jTableDatosProductoProduMermaOrderBy = new JTableMe();        
			this.jTableDatosProductoProduMermaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoProduMermaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoProduMermaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoProduMermaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoProduMermaOrderBy.setViewportView(this.jTableDatosProductoProduMermaOrderBy);
			this.jTableDatosProductoProduMermaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoProduMermaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoProduMerma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoProduMerma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoProduMerma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoProduMerma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoProduMerma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoProduMerma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoProduMerma.setTitle("Orden");
			this.jInternalFrameOrderByProductoProduMerma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoProduMerma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoProduMerma.setResizable(true);
			this.jInternalFrameOrderByProductoProduMerma.setClosable(true);
			this.jInternalFrameOrderByProductoProduMerma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoProduMerma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProduMerma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProduMerma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Merma Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoProduMerma.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoProduMerma.ipady =150;
				
			this.jPanelOrderByProductoProduMerma.add(jScrollPanelDatosProductoProduMermaOrderBy, this.gridBagConstraintsProductoProduMerma);//this.jTableDatosProductoProduMermaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoProduMerma = new JButtonMe();
			this.jButtonCerrarOrderByProductoProduMerma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoProduMerma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoProduMerma.setToolTipText("Cancelar"+" "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMerma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoProduMerma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoProduMerma.add(this.jButtonCerrarOrderByProductoProduMerma, this.gridBagConstraintsProductoProduMerma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoProduMerma = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoProduMerma= new JScrollPane(jPanelOrderByProductoProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMerma.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoProduMerma.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProduMerma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoProduMerma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoProduMerma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoProduMerma);
			
			this.jInternalFrameOrderByProductoProduMerma.getContentPane().add(this.jScrollPanelOrderByProductoProduMerma, this.gridBagConstraintsProductoProduMerma);			
		
		} else {
			this.jButtonAbrirOrderByProductoProduMerma = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoprodumermaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoProduMerma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoProduMerma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoProduMerma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoProduMerma.getRowHeight();//ProductoProduMermaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoProduMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProduMerma.isSelected()) {
					iHeightTable=ProductoProduMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoProduMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProduMerma.isSelected()) {
					iHeightTable=ProductoProduMermaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduMermaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoProduMerma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProduMerma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProduMerma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoProduMerma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProduMerma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProduMerma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoProduMerma!=null && this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy()!=null) {
			//if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoProduMerma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoProduMerma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoProduMerma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoProduMerma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProduMerma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProduMerma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoprodumermaLogic.getProductoProduMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumermas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoProduMerma> TraerProductoProduMermaBeans(List<ProductoProduMerma> productoprodumermas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoProduMerma productoprodumerma:productoprodumermas) {
					
				if(!(ProductoProduMermaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoProduMermaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoprodumerma.setsDetalleGeneralEntityReporte(ProductoProduMermaConstantesFunciones.getProductoProduMermaDescripcion(productoprodumerma));
										
						
					
						
					
				} else  {
							
					//productoprodumerma.setsDetalleGeneralEntityReporte(productoprodumerma.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoprodumermabeans.add(productoprodumermabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoprodumermas;
    }
	//PARA REPORTES FIN
}
