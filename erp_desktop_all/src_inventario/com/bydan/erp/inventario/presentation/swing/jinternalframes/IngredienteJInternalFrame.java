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
import com.bydan.erp.inventario.util.IngredienteConstantesFunciones;

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
public class IngredienteJInternalFrame extends IngredienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarIngrediente;
	
	protected JMenuBar jmenuBarIngrediente;
	
	protected JMenu jmenuIngrediente;
	protected JMenu jmenuDatosIngrediente;
	protected JMenu jmenuArchivoIngrediente;
	protected JMenu jmenuAccionesIngrediente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIngrediente;	
	protected GridBagConstraints gridBagConstraintsIngrediente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public IngredienteDetalleFormJInternalFrame jInternalFrameDetalleFormIngrediente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoIngrediente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionIngrediente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected BodegaBeanSwingJInternalFrame bodegarelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegarelacion="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ProductoBeanSwingJInternalFrame productorelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productorelacion="";
	
	public IngredienteSessionBean ingredienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public BodegaSessionBean bodegarelacionSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ProductoSessionBean productorelacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Ingrediente> ingredientes;		
	public List<Ingrediente> ingredientesEliminados;	
	public List<Ingrediente> ingredientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByIngrediente;		
	protected JButton jButtonAbrirOrderByIngrediente;
	
	
	//protected JPanel jPanelOrderByIngrediente;
	//public JScrollPane jScrollPanelOrderByIngrediente;	
	//protected JButton jButtonCerrarOrderByIngrediente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public IngredienteLogic ingredienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosIngrediente;
	public JScrollPane jScrollPanelDatosEdicionIngrediente;
	public JScrollPane jScrollPanelDatosGeneralIngrediente;
    
	
	
	//public JScrollPane jScrollPanelDatosIngredienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoIngrediente;
	//public JScrollPane jScrollPanelImportacionIngrediente;
	
	
	
	protected JPanel jPanelAccionesIngrediente;
	
    protected JPanel jPanelPaginacionIngrediente;
    protected JPanel jPanelParametrosReportesIngrediente;
	protected JPanel jPanelParametrosReportesAccionesIngrediente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Ingrediente;
	protected JPanel jPanelParametrosAuxiliar2Ingrediente;
	protected JPanel jPanelParametrosAuxiliar3Ingrediente;
	protected JPanel jPanelParametrosAuxiliar4Ingrediente;
	//protected JPanel jPanelParametrosAuxiliar5Ingrediente;
	
	
	
	//protected JPanel jPanelReporteDinamicoIngrediente;
	//protected JPanel jPanelImportacionIngrediente;
	
	
	public JTable jTableDatosIngrediente;
	
	
	
	//public JTable jTableDatosIngredienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoIngrediente;
	protected JButton jButtonDuplicarIngrediente;
	protected JButton jButtonCopiarIngrediente;
	protected JButton jButtonVerFormIngrediente;
	protected JButton jButtonNuevoRelacionesIngrediente;
	protected JButton jButtonModificarIngrediente;
	
    protected JButton jButtonGuardarCambiosTablaIngrediente;
	protected JButton jButtonCerrarIngrediente;
	
	
	protected JButton jButtonRecargarInformacionIngrediente;
	protected JButton jButtonProcesarInformacionIngrediente;
	
	
	protected JButton jButtonAnterioresIngrediente;
	protected JButton jButtonSiguientesIngrediente;
	protected JButton jButtonNuevoGuardarCambiosIngrediente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoIngrediente;
	//protected JButton jButtonCerrarReporteDinamicoIngrediente;
	//protected JButton jButtonGenerarExcelReporteDinamicoIngrediente;	
	
	
	
	//protected JButton jButtonAbrirImportacionIngrediente;
	//protected JButton jButtonGenerarImportacionIngrediente;
	//protected JButton jButtonCerrarImportacionIngrediente;
	//protected JFileChooser jFileChooserImportacionIngrediente;
	//protected File fileImportacionIngrediente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIngrediente;
	protected JButton jButtonDuplicarToolBarIngrediente;
	protected JButton jButtonNuevoRelacionesToolBarIngrediente;
	
	
	public JButton jButtonGuardarCambiosToolBarIngrediente;
	protected JButton jButtonCopiarToolBarIngrediente;
	protected JButton jButtonVerFormToolBarIngrediente;
	public JButton jButtonGuardarCambiosTablaToolBarIngrediente;
	protected JButton jButtonMostrarOcultarTablaToolBarIngrediente;
	protected JButton jButtonCerrarToolBarIngrediente;
	
	protected JButton jButtonRecargarInformacionToolBarIngrediente;
	protected JButton jButtonProcesarInformacionToolBarIngrediente;
	protected JButton jButtonAnterioresToolBarIngrediente;
	protected JButton jButtonSiguientesToolBarIngrediente;
	protected JButton jButtonNuevoGuardarCambiosToolBarIngrediente;
	protected JButton jButtonAbrirOrderByToolBarIngrediente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIngrediente;
	protected JMenuItem jMenuItemDuplicarIngrediente;
	protected JMenuItem jMenuItemNuevoRelacionesIngrediente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosIngrediente;
	protected JMenuItem jMenuItemCopiarIngrediente;
	protected JMenuItem jMenuItemVerFormIngrediente;
	protected JMenuItem jMenuItemGuardarCambiosTablaIngrediente;
	protected JMenuItem jMenuItemCerrarIngrediente;
	protected JMenuItem jMenuItemDetalleCerrarIngrediente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByIngrediente;
	protected JMenuItem jMenuItemDetalleMostarOcultarIngrediente;
	
	protected JMenuItem jMenuItemRecargarInformacionIngrediente;
	protected JMenuItem jMenuItemProcesarInformacionIngrediente;
	protected JMenuItem jMenuItemAnterioresIngrediente;
	protected JMenuItem jMenuItemSiguientesIngrediente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIngrediente;
	protected JMenuItem jMenuItemAbrirOrderByIngrediente;
	protected JMenuItem jMenuItemMostrarOcultarIngrediente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIngrediente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosIngrediente;
	protected JCheckBox jCheckBoxSeleccionadosIngrediente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaIngrediente;
	protected JCheckBox jCheckBoxConGraficoReporteIngrediente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesIngrediente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesIngrediente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoIngrediente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoIngrediente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesIngrediente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionIngrediente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIngrediente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIngrediente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarIngrediente;
	protected JTextField jTextFieldValorCampoGeneralIngrediente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteIngrediente;
	//public JList<Reporte> jListColumnasSelectReporteIngrediente;
	//public JScrollPane jScrollColumnasSelectReporteIngrediente;
	
	//public JLabel jLabelRelacionesSelectReporteIngrediente;
	//public JList<Reporte> jListRelacionesSelectReporteIngrediente;
	//public JScrollPane jScrollRelacionesSelectReporteIngrediente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoIngrediente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoIngrediente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoIngrediente;
	//public JLabel jLabelTiposArchivoReporteDinamicoIngrediente;
	
		
	//public JLabel jLabelArchivoImportacionIngrediente;	
	//public JLabel jLabelPathArchivoImportacionIngrediente;
	//protected JTextField jTextFieldPathArchivoImportacionIngrediente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoIngrediente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoIngrediente;
	
	//public JLabel jLabelColumnaCategoriaValorIngrediente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorIngrediente;
	
	//public JLabel jLabelColumnasValoresGraficoIngrediente;
	//public JList<Reporte> jListColumnasValoresGraficoIngrediente;
	//public JScrollPane jScrollColumnasValoresGraficoIngrediente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoIngrediente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoIngrediente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasIngrediente;
	public JPanel jPanelFK_IdBodegaIngrediente;
	public JButton jButtonFK_IdBodegaIngrediente;
	public JPanel jPanelFK_IdBodegaRelacionIngrediente;
	public JButton jButtonFK_IdBodegaRelacionIngrediente;
	public JPanel jPanelFK_IdProductoIngrediente;
	public JButton jButtonFK_IdProductoIngrediente;
	public JPanel jPanelFK_IdProductoRelacionIngrediente;
	public JButton jButtonFK_IdProductoRelacionIngrediente;
	
	public JPanel jPanelid_bodegaFK_IdBodegaIngrediente;
	public JLabel jLabelid_bodegaFK_IdBodegaIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaIngrediente;
	public JButton jButtonid_bodegaFK_IdBodegaIngrediente= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaIngredienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_relacionFK_IdBodegaRelacionIngrediente;
	public JLabel jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente;
	public JButton jButtonid_bodega_relacionFK_IdBodegaRelacionIngrediente= new JButtonMe();
	public JButton jButtonid_bodega_relacionFK_IdBodegaRelacionIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_bodega_relacionFK_IdBodegaRelacionIngredienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoIngrediente;
	public JLabel jLabelid_productoFK_IdProductoIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoIngrediente;
	public JButton jButtonid_productoFK_IdProductoIngrediente= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoIngredienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoIngrediente;
	
	public JPanel jPanelid_producto_relacionFK_IdProductoRelacionIngrediente;
	public JLabel jLabelid_producto_relacionFK_IdProductoRelacionIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente;
	public JButton jButtonid_producto_relacionFK_IdProductoRelacionIngrediente= new JButtonMe();
	public JButton jButtonid_producto_relacionFK_IdProductoRelacionIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_producto_relacionFK_IdProductoRelacionIngredienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente;
	
	
	
	
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
	public IngredienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngredienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngredienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngredienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionIngrediente)	{
		this.jButtonRecargarInformacionIngrediente = jButtonRecargarInformacionIngrediente;
	}
	
	public JButton getjButtonProcesarInformacionIngrediente() {
		return this.jButtonProcesarInformacionIngrediente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIngrediente)	{
		this.jButtonProcesarInformacionIngrediente = jButtonProcesarInformacionIngrediente;
	}
	
	
	public JButton getjButtonRecargarInformacionIngrediente() {
		return this.jButtonRecargarInformacionIngrediente;
	}
	
	
	public List<Ingrediente> getingredientes() {
		return this.ingredientes;
	}

	public void setingredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public List<Ingrediente> getingredientesAux() {
		return this.ingredientesAux;
	}

	public void setingredientesAux(List<Ingrediente> ingredientesAux) {
		this.ingredientesAux = ingredientesAux;
	}
	
	public List<Ingrediente> getingredientesEliminados() {
		return this.ingredientesEliminados;
	}

	public void setIngredientesEliminados(List<Ingrediente> ingredientesEliminados) {
		this.ingredientesEliminados = ingredientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarIngrediente() {
		return jComboBoxTiposSeleccionarIngrediente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarIngrediente(
			JComboBox jComboBoxTiposSeleccionarIngrediente) {
		this.jComboBoxTiposSeleccionarIngrediente = jComboBoxTiposSeleccionarIngrediente;
	}
	
	public void setBorderResaltarTiposSeleccionarIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarIngrediente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralIngrediente() {
		return jTextFieldValorCampoGeneralIngrediente;
	}

	public void setjTextFieldValorCampoGeneralIngrediente(
			JTextField jTextFieldValorCampoGeneralIngrediente) {
		this.jTextFieldValorCampoGeneralIngrediente = jTextFieldValorCampoGeneralIngrediente;
	}

	public void setBorderResaltarValorCampoGeneralIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralIngrediente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosIngrediente() {
		return this.jCheckBoxSeleccionarTodosIngrediente;
	}

	public void setjCheckBoxSeleccionarTodosIngrediente(
			JCheckBox jCheckBoxSeleccionarTodosIngrediente) {
		this.jCheckBoxSeleccionarTodosIngrediente = jCheckBoxSeleccionarTodosIngrediente;
	}

	public void setBorderResaltarSeleccionarTodosIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosIngrediente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosIngrediente() {
		return this.jCheckBoxSeleccionadosIngrediente;
	}

	public void setjCheckBoxSeleccionadosIngrediente(
			JCheckBox jCheckBoxSeleccionadosIngrediente) {
		this.jCheckBoxSeleccionadosIngrediente = jCheckBoxSeleccionadosIngrediente;
	}
	
	public void setBorderResaltarSeleccionadosIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosIngrediente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesIngrediente() {
		return this.jComboBoxTiposArchivosReportesIngrediente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesIngrediente(
			JComboBox jComboBoxTiposArchivosReportesIngrediente) {
		this.jComboBoxTiposArchivosReportesIngrediente = jComboBoxTiposArchivosReportesIngrediente;
	}

	public void setBorderResaltarTiposArchivosReportesIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesIngrediente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesIngrediente() {
		return this.jComboBoxTiposReportesIngrediente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesIngrediente(
			JComboBox jComboBoxTiposReportesIngrediente) {
		this.jComboBoxTiposReportesIngrediente = jComboBoxTiposReportesIngrediente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoIngrediente() {
	//	return jComboBoxTiposReportesDinamicoIngrediente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoIngrediente(
	//		JComboBox jComboBoxTiposReportesDinamicoIngrediente) {
	//	this.jComboBoxTiposReportesDinamicoIngrediente = jComboBoxTiposReportesDinamicoIngrediente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoIngrediente() {
	//	return jComboBoxTiposArchivosReportesDinamicoIngrediente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoIngrediente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoIngrediente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoIngrediente = jComboBoxTiposArchivosReportesDinamicoIngrediente;
	//}
	
	public void setBorderResaltarTiposReportesIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesIngrediente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesIngrediente() {
		return this.jComboBoxTiposGraficosReportesIngrediente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesIngrediente(
			JComboBox jComboBoxTiposGraficosReportesIngrediente) {
		this.jComboBoxTiposGraficosReportesIngrediente = jComboBoxTiposGraficosReportesIngrediente;
	}
	
	public void setBorderResaltarTiposGraficosReportesIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesIngrediente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionIngrediente() {
		return this.jComboBoxTiposPaginacionIngrediente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionIngrediente(
			JComboBox jComboBoxTiposPaginacionIngrediente) {
		this.jComboBoxTiposPaginacionIngrediente = jComboBoxTiposPaginacionIngrediente;
	}
	
	public void setBorderResaltarTiposPaginacionIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionIngrediente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesIngrediente() {
		return this.jComboBoxTiposRelacionesIngrediente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIngrediente() {
		return this.jComboBoxTiposAccionesIngrediente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIngrediente(
			JComboBox jComboBoxTiposRelacionesIngrediente) {
		this.jComboBoxTiposRelacionesIngrediente = jComboBoxTiposRelacionesIngrediente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIngrediente(
			JComboBox jComboBoxTiposAccionesIngrediente) {
		this.jComboBoxTiposAccionesIngrediente = jComboBoxTiposAccionesIngrediente;
	}
	
	public void setBorderResaltarTiposRelacionesIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesIngrediente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesIngrediente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngrediente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesIngrediente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoIngrediente() {
	//	return jCheckBoxConGraficoDinamicoIngrediente;
	//}

	//public void setjCheckBoxConGraficoDinamicoIngrediente(
	//		JCheckBox jCheckBoxConGraficoDinamicoIngrediente) {
	//	this.jCheckBoxConGraficoDinamicoIngrediente = jCheckBoxConGraficoDinamicoIngrediente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoIngrediente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarIngrediente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoIngrediente .setBorder(borderResaltar);		
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
		this.ingredienteSessionBean=new IngredienteSessionBean();
		
		this.ingredienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingredienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ingredienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=IngredienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=IngredienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IngredienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IngredienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IngredienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ingrediente MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
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
		
		IngredienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarIngrediente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarIngrediente,this.jTtoolBarIngrediente,
							"nuevo","nuevo","Nuevo"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarIngrediente,this.jTtoolBarIngrediente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarIngrediente,this.jTtoolBarIngrediente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarIngrediente,this.jTtoolBarIngrediente,
							"duplicar","duplicar","Duplicar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarIngrediente,this.jTtoolBarIngrediente,
							"copiar","copiar","Copiar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarIngrediente,this.jTtoolBarIngrediente,
							"ver_form","ver_form","Ver"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngrediente,this.jTtoolBarIngrediente,
							"recargar","recargar","Recargar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngrediente,this.jTtoolBarIngrediente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngrediente,this.jTtoolBarIngrediente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarIngrediente,this.jTtoolBarIngrediente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarIngrediente,this.jTtoolBarIngrediente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarIngrediente,this.jTtoolBarIngrediente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarIngrediente,this.jTtoolBarIngrediente,
							"cerrar","cerrar","Salir"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarIngrediente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarIngrediente;
			
				this.jButtonProcesarInformacionToolBarIngrediente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarIngrediente;
				
		//protected JButton jButtonModificarToolBarIngrediente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarIngrediente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuIngrediente=new JMenuMe("General");
		this.jmenuArchivoIngrediente=new JMenuMe("Archivo");
		this.jmenuAccionesIngrediente=new JMenuMe("Acciones");
		this.jmenuDatosIngrediente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIngrediente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIngrediente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIngrediente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarIngrediente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarIngrediente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarIngrediente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesIngrediente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesIngrediente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesIngrediente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosIngrediente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIngrediente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIngrediente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarIngrediente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarIngrediente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarIngrediente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormIngrediente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormIngrediente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormIngrediente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaIngrediente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaIngrediente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaIngrediente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIngrediente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIngrediente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIngrediente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionIngrediente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionIngrediente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionIngrediente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionIngrediente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionIngrediente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionIngrediente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresIngrediente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresIngrediente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresIngrediente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesIngrediente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesIngrediente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesIngrediente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByIngrediente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByIngrediente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByIngrediente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIngrediente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIngrediente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIngrediente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByIngrediente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByIngrediente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByIngrediente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIngrediente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIngrediente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIngrediente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosIngrediente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosIngrediente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosIngrediente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoIngrediente.add(this.jMenuItemCerrarIngrediente);
			
			this.jmenuAccionesIngrediente.add(this.jMenuItemNuevoIngrediente);
			this.jmenuAccionesIngrediente.add(this.jMenuItemNuevoGuardarCambiosIngrediente);
			this.jmenuAccionesIngrediente.add(this.jMenuItemNuevoRelacionesIngrediente);
			this.jmenuAccionesIngrediente.add(this.jMenuItemGuardarCambiosTablaIngrediente);		
			this.jmenuAccionesIngrediente.add(this.jMenuItemDuplicarIngrediente);		
			this.jmenuAccionesIngrediente.add(this.jMenuItemCopiarIngrediente);		
			this.jmenuAccionesIngrediente.add(this.jMenuItemVerFormIngrediente);		
			
			this.jmenuDatosIngrediente.add(this.jMenuItemRecargarInformacionIngrediente);				
			this.jmenuDatosIngrediente.add(this.jMenuItemAnterioresIngrediente);				
			this.jmenuDatosIngrediente.add(this.jMenuItemSiguientesIngrediente);				
			this.jmenuDatosIngrediente.add(this.jMenuItemAbrirOrderByIngrediente);				
			this.jmenuDatosIngrediente.add(this.jMenuItemMostrarOcultarIngrediente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesIngrediente.add(this.jMenuItemGuardarCambiosIngrediente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarIngrediente.add(this.jmenuArchivoIngrediente);		
			this.jmenuBarIngrediente.add(this.jmenuAccionesIngrediente);		
			this.jmenuBarIngrediente.add(this.jmenuDatosIngrediente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarIngrediente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasIngrediente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaIngrediente.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaIngrediente= new JButtonMe();
		this.jButtonFK_IdBodegaIngrediente.setText("Buscar");
		this.jButtonFK_IdBodegaIngrediente.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaIngrediente,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaIngrediente = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaIngrediente.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaIngrediente.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaIngrediente= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaRelacionIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaRelacionIngrediente.setToolTipText("Buscar Por Bodega Relacion ");
		this.jButtonFK_IdBodegaRelacionIngrediente= new JButtonMe();
		this.jButtonFK_IdBodegaRelacionIngrediente.setText("Buscar");
		this.jButtonFK_IdBodegaRelacionIngrediente.setToolTipText("Buscar Por Bodega Relacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaRelacionIngrediente,"buscar_button","Buscar Por Bodega Relacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaRelacionIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente = new JLabelMe();
		jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente.setText("Bodega Relacion :");
		jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente.setToolTipText("Bodega Relacion");
		jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente= new JComboBoxMe();
		jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoIngrediente.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoIngrediente= new JButtonMe();
		this.jButtonFK_IdProductoIngrediente.setText("Buscar");
		this.jButtonFK_IdProductoIngrediente.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoIngrediente,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoIngrediente = new JLabelMe();
		jLabelid_productoFK_IdProductoIngrediente.setText("Producto :");
		jLabelid_productoFK_IdProductoIngrediente.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoIngrediente= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoIngrediente= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoIngrediente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoIngrediente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoIngrediente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoIngrediente.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoIngrediente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoIngrediente.setFocusable(false);

		this.jPanelFK_IdProductoRelacionIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoRelacionIngrediente.setToolTipText("Buscar Por Producto Relacion ");
		this.jButtonFK_IdProductoRelacionIngrediente= new JButtonMe();
		this.jButtonFK_IdProductoRelacionIngrediente.setText("Buscar");
		this.jButtonFK_IdProductoRelacionIngrediente.setToolTipText("Buscar Por Producto Relacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoRelacionIngrediente,"buscar_button","Buscar Por Producto Relacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoRelacionIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_producto_relacionFK_IdProductoRelacionIngrediente = new JLabelMe();
		jLabelid_producto_relacionFK_IdProductoRelacionIngrediente.setText("Producto Relacion :");
		jLabelid_producto_relacionFK_IdProductoRelacionIngrediente.setToolTipText("Producto Relacion");
		jLabelid_producto_relacionFK_IdProductoRelacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_relacionFK_IdProductoRelacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_relacionFK_IdProductoRelacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_producto_relacionFK_IdProductoRelacionIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente= new JComboBoxMe();
		jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente= new JButtonMe();
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente.setText("Buscar");
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente.setFocusable(false);


		this.jTabbedPaneBusquedasIngrediente=new JTabbedPane();


		this.jTabbedPaneBusquedasIngrediente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasIngrediente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasIngrediente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasIngrediente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleIngrediente = new IngredienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ingrediente DATOS");
			this.jInternalFrameDetalleFormIngrediente = new IngredienteDetalleFormJInternalFrame(jDesktopPane,this.ingredienteSessionBean.getConGuardarRelaciones(),this.ingredienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormIngrediente = null;//new IngredienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIngrediente= new GridBagLayout();
		
		
		this.jTableDatosIngrediente = new JTableMe();      
		
		String sToolTipIngrediente="";
		sToolTipIngrediente=IngredienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIngrediente+="(Inventario.Ingrediente)";
		}
		
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipIngrediente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosIngrediente.setToolTipText(sToolTipIngrediente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosIngrediente);
		this.jTableDatosIngrediente.setAutoCreateRowSorter(true);
		this.jTableDatosIngrediente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosIngrediente.setRowSelectionAllowed(true);
		this.jTableDatosIngrediente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosIngrediente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoIngrediente = new JButtonMe();
		this.jButtonDuplicarIngrediente = new JButtonMe();
		this.jButtonCopiarIngrediente = new JButtonMe();
		this.jButtonVerFormIngrediente = new JButtonMe();
		this.jButtonNuevoRelacionesIngrediente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaIngrediente = new JButtonMe();
		this.jButtonCerrarIngrediente = new JButtonMe();
		
		this.jScrollPanelDatosIngrediente = new JScrollPane();   
        this.jScrollPanelDatosGeneralIngrediente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ingrediente";
		
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingredientes" + this.sPath));
		} else {
			this.jScrollPanelDatosIngrediente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIngrediente.setToolTipText("Acciones");
        this.jPanelAccionesIngrediente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoIngrediente=new ReporteDinamicoJInternalFrame(IngredienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoIngrediente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionIngrediente=new ImportacionJInternalFrame(IngredienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionIngrediente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByIngrediente = new JButtonMe();
		
		this.jButtonAbrirOrderByIngrediente.setText("Orden");
		this.jButtonAbrirOrderByIngrediente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIngrediente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIngrediente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngrediente,false,this);
			
			//this.cargarOrderByIngrediente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIngrediente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngrediente,true,this);
			
			//this.cargarOrderByIngrediente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosIngrediente.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosIngrediente.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosIngrediente.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosIngrediente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosIngrediente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosIngrediente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoIngrediente.setText("Nuevo");
		this.jButtonDuplicarIngrediente.setText("Duplicar");
		this.jButtonCopiarIngrediente.setText("Copiar");
		this.jButtonVerFormIngrediente.setText("Ver");
		this.jButtonNuevoRelacionesIngrediente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaIngrediente.setText("Guardar");
		this.jButtonCerrarIngrediente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIngrediente,"nuevo_button","Nuevo",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarIngrediente,"duplicar_button","Duplicar",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarIngrediente,"copiar_button","Copiar",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormIngrediente,"ver_form","Ver",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesIngrediente,"nuevorelaciones_button","Nuevo Rel",this.ingredienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIngrediente,"guardarcambiostabla_button","Guardar",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIngrediente,"cerrar_button","Salir",this.ingredienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoIngrediente.setToolTipText("Nuevo"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarIngrediente.setToolTipText("Duplicar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarIngrediente.setToolTipText("Copiar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormIngrediente.setToolTipText("Ver"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesIngrediente.setToolTipText("Nuevo Rel"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaIngrediente.setToolTipText("Guardar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIngrediente.setToolTipText("Salir"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIngrediente";
		inputMap = this.jButtonNuevoIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIngrediente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIngrediente"));
		
		//DUPLICAR
		sMapKey = "DuplicarIngrediente";
		inputMap = this.jButtonDuplicarIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarIngrediente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarIngrediente"));
		
		//COPIAR
		sMapKey = "CopiarIngrediente";
		inputMap = this.jButtonCopiarIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarIngrediente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarIngrediente"));
		
		//VEr FORM
		sMapKey = "VerFormIngrediente";
		inputMap = this.jButtonVerFormIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormIngrediente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormIngrediente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesIngrediente";
		inputMap = this.jButtonNuevoRelacionesIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesIngrediente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarIngrediente";
		inputMap = this.jButtonModificarIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarIngrediente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarIngrediente";
		inputMap = this.jButtonCerrarIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIngrediente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIngrediente";
		inputMap = this.jButtonGuardarCambiosTablaIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIngrediente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Ingrediente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Ingrediente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Ingrediente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Ingrediente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Ingrediente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesIngrediente.setName("jPanelParametrosReportesIngrediente"); 
		
		this.jPanelParametrosReportesAccionesIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesIngrediente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesIngrediente.setName("jPanelParametrosReportesAccionesIngrediente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionIngrediente = new JButtonMe();
		this.jButtonRecargarInformacionIngrediente.setText("Recargar");
		this.jButtonRecargarInformacionIngrediente.setToolTipText("Recargar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionIngrediente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionIngrediente = new JButtonMe();
		this.jButtonProcesarInformacionIngrediente.setText("Procesar");
		this.jButtonProcesarInformacionIngrediente.setToolTipText("Procesar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionIngrediente.setVisible(false);
			
		this.jButtonProcesarInformacionIngrediente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIngrediente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIngrediente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngrediente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesIngrediente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngrediente.setText("TIPO");       
		this.jComboBoxTiposReportesIngrediente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngrediente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesIngrediente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionIngrediente.setText("Paginacion");
		this.jComboBoxTiposPaginacionIngrediente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesIngrediente.setText("Accion");
		this.jComboBoxTiposRelacionesIngrediente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIngrediente.setText("Accion");
		this.jComboBoxTiposAccionesIngrediente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarIngrediente.setText("Accion");
		this.jComboBoxTiposSeleccionarIngrediente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralIngrediente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralIngrediente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIngrediente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIngrediente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesIngrediente = new JLabelMe();
		
		this.jLabelAccionesIngrediente.setText("Acciones");		
		this.jLabelAccionesIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosIngrediente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosIngrediente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosIngrediente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosIngrediente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosIngrediente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosIngrediente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaIngrediente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaIngrediente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaIngrediente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteIngrediente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteIngrediente.setText("Graf.");
		this.jCheckBoxConGraficoReporteIngrediente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresIngrediente = new JButtonMe();
		//this.jButtonAnterioresIngrediente.setText("<<");
        this.jButtonAnterioresIngrediente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresIngrediente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesIngrediente = new JButtonMe();
		//this.jButtonSiguientesIngrediente.setText(">>");
        this.jButtonSiguientesIngrediente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesIngrediente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosIngrediente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosIngrediente.setText("Nue");
        this.jButtonNuevoGuardarCambiosIngrediente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosIngrediente,"nuevoguardarcambios_button","Nue",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosIngrediente";
		inputMap = this.jButtonNuevoGuardarCambiosIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosIngrediente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionIngrediente";
		inputMap = this.jButtonRecargarInformacionIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionIngrediente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesIngrediente";
		inputMap = this.jButtonSiguientesIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesIngrediente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresIngrediente";
		inputMap = this.jButtonAnterioresIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresIngrediente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasIngrediente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesIngrediente.setMinimumSize(new Dimension(this.getWidth(),IngredienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngredienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIngrediente.setMaximumSize(new Dimension(this.getWidth(),IngredienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngredienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIngrediente.setPreferredSize(new Dimension(this.getWidth(),IngredienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngredienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionIngrediente = new GridBagLayout();

			this.jPanelPaginacionIngrediente.setLayout(gridaBagLayoutPaginacionIngrediente);						
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = 0;
			this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionIngrediente.add(this.jButtonAnterioresIngrediente, this.gridBagConstraintsIngrediente);
					
						
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIngrediente.gridy = 0;
			
			this.jPanelPaginacionIngrediente.add(this.jButtonNuevoGuardarCambiosIngrediente, this.gridBagConstraintsIngrediente);
						
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIngrediente.gridy = 0;
			this.jPanelPaginacionIngrediente.add(this.jButtonSiguientesIngrediente, this.gridBagConstraintsIngrediente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = 1;
			this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngrediente.add(this.jButtonNuevoIngrediente, this.gridBagConstraintsIngrediente);
						
			
			
			if(!this.ingredienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsIngrediente = new GridBagConstraints();
				this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsIngrediente.gridy = 1;
				this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionIngrediente.add(this.jButtonGuardarCambiosTablaIngrediente, this.gridBagConstraintsIngrediente);
			}
			
			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = 1;
			this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngrediente.add(this.jButtonDuplicarIngrediente, this.gridBagConstraintsIngrediente);
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = 1;
			this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngrediente.add(this.jButtonCopiarIngrediente, this.gridBagConstraintsIngrediente);
		
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = 1;
			this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngrediente.add(this.jButtonVerFormIngrediente, this.gridBagConstraintsIngrediente);
		
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = 1;
			this.gridBagConstraintsIngrediente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionIngrediente.add(this.jButtonCerrarIngrediente, this.gridBagConstraintsIngrediente);
		
		
		
		this.jButtonRecargarInformacionIngrediente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIngrediente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIngrediente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesIngrediente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIngrediente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIngrediente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesIngrediente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIngrediente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIngrediente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesIngrediente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIngrediente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIngrediente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionIngrediente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIngrediente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIngrediente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesIngrediente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIngrediente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIngrediente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesIngrediente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngrediente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngrediente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarIngrediente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIngrediente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIngrediente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaIngrediente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIngrediente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIngrediente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteIngrediente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIngrediente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIngrediente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosIngrediente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIngrediente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIngrediente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosIngrediente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIngrediente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIngrediente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesIngrediente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesIngrediente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Ingrediente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Ingrediente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Ingrediente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Ingrediente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesIngrediente.setLayout(gridaBagParametrosReportesIngrediente);
			this.jPanelParametrosReportesAccionesIngrediente.setLayout(gridaBagParametrosReportesAccionesIngrediente);
			
			
			this.jPanelParametrosAuxiliar1Ingrediente.setLayout(gridaBagParametrosAuxiliar1Ingrediente);
			this.jPanelParametrosAuxiliar2Ingrediente.setLayout(gridaBagParametrosAuxiliar2Ingrediente);
			this.jPanelParametrosAuxiliar3Ingrediente.setLayout(gridaBagParametrosAuxiliar3Ingrediente);
			this.jPanelParametrosAuxiliar4Ingrediente.setLayout(gridaBagParametrosAuxiliar4Ingrediente);
			//this.jPanelParametrosAuxiliar5Ingrediente.setLayout(gridaBagParametrosAuxiliar2Ingrediente);			
			
			
			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngrediente.add(this.jButtonRecargarInformacionIngrediente, this.gridBagConstraintsIngrediente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ingrediente.add(this.jComboBoxTiposPaginacionIngrediente, this.gridBagConstraintsIngrediente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ingrediente.add(this.jCheckBoxConAltoMaximoTablaIngrediente, this.gridBagConstraintsIngrediente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ingrediente.add(this.jComboBoxTiposArchivosReportesIngrediente, this.gridBagConstraintsIngrediente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngrediente.add(this.jPanelParametrosAuxiliar1Ingrediente, this.gridBagConstraintsIngrediente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Ingrediente.add(this.jComboBoxTiposReportesIngrediente, this.gridBagConstraintsIngrediente);																		
			
			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Ingrediente.add(this.jComboBoxTiposGraficosReportesIngrediente, this.gridBagConstraintsIngrediente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngrediente.add(this.jPanelParametrosAuxiliar4Ingrediente, this.gridBagConstraintsIngrediente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngrediente.add(this.jComboBoxTiposReportesIngrediente, this.gridBagConstraintsIngrediente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngrediente.add(this.jCheckBoxGenerarReporteIngrediente, this.gridBagConstraintsIngrediente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngrediente.add(this.jPanelParametrosAuxiliar2Ingrediente, this.gridBagConstraintsIngrediente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngrediente.add(this.jLabelAccionesIngrediente, this.gridBagConstraintsIngrediente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsIngrediente = new GridBagConstraints();
				this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesIngrediente.add(this.jButtonAbrirOrderByIngrediente, this.gridBagConstraintsIngrediente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngrediente.add(this.jComboBoxTiposSeleccionarIngrediente, this.gridBagConstraintsIngrediente);			
			
			
			/*
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngrediente.add(this.jCheckBoxSeleccionarTodosIngrediente, this.gridBagConstraintsIngrediente);
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngrediente.add(this.jCheckBoxConGraficoReporteIngrediente, this.gridBagConstraintsIngrediente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ingrediente.add(this.jCheckBoxSeleccionarTodosIngrediente, this.gridBagConstraintsIngrediente);															
				
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ingrediente.add(this.jCheckBoxSeleccionadosIngrediente, this.gridBagConstraintsIngrediente);															
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngrediente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ingrediente.add(this.jCheckBoxConGraficoReporteIngrediente, this.gridBagConstraintsIngrediente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngrediente.add(this.jPanelParametrosAuxiliar3Ingrediente, this.gridBagConstraintsIngrediente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngrediente.add(this.jComboBoxTiposAccionesIngrediente, this.gridBagConstraintsIngrediente);
	
				
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngrediente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngrediente.add(this.jTextFieldValorCampoGeneralIngrediente, this.gridBagConstraintsIngrediente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosIngrediente = new GridBagLayout();

			this.jScrollPanelDatosIngrediente.setLayout(gridaBagLayoutDatosIngrediente);
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = 0;
			this.gridBagConstraintsIngrediente.gridx = 0;
			
			this.jScrollPanelDatosIngrediente.add(this.jTableDatosIngrediente, this.gridBagConstraintsIngrediente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosIngrediente.setViewportView(this.jTableDatosIngrediente);
		this.jTableDatosIngrediente.setFillsViewportHeight(true);
		this.jTableDatosIngrediente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesIngrediente= new GridBagLayout();
		this.jPanelAccionesIngrediente.setLayout(gridaBagLayoutAccionesIngrediente);
		
		
		/*	
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 0;
			
		this.jPanelAccionesIngrediente.add(this.jButtonNuevoIngrediente, this.gridBagConstraintsIngrediente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaIngrediente= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaIngrediente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaIngrediente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaIngrediente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaIngrediente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaIngrediente.setLayout(gridaBagLayoutFK_IdBodegaIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 0;
		jPanelFK_IdBodegaIngrediente.add(jLabelid_bodegaFK_IdBodegaIngrediente, gridBagConstraintsIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 1;
		jPanelFK_IdBodegaIngrediente.add(jComboBoxid_bodegaFK_IdBodegaIngrediente, gridBagConstraintsIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 1;
		gridBagConstraintsIngrediente.gridx =1;
		jPanelFK_IdBodegaIngrediente.add(jButtonFK_IdBodegaIngrediente, gridBagConstraintsIngrediente);

		jTabbedPaneBusquedasIngrediente.addTab("1.-Por Bodega ", jPanelFK_IdBodegaIngrediente);
		jTabbedPaneBusquedasIngrediente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaRelacionIngrediente= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaRelacionIngrediente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaRelacionIngrediente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaRelacionIngrediente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaRelacionIngrediente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaRelacionIngrediente.setLayout(gridaBagLayoutFK_IdBodegaRelacionIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 0;
		jPanelFK_IdBodegaRelacionIngrediente.add(jLabelid_bodega_relacionFK_IdBodegaRelacionIngrediente, gridBagConstraintsIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 1;
		jPanelFK_IdBodegaRelacionIngrediente.add(jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente, gridBagConstraintsIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 1;
		gridBagConstraintsIngrediente.gridx =1;
		jPanelFK_IdBodegaRelacionIngrediente.add(jButtonFK_IdBodegaRelacionIngrediente, gridBagConstraintsIngrediente);

		jTabbedPaneBusquedasIngrediente.addTab("2.-Por Bodega Relacion ", jPanelFK_IdBodegaRelacionIngrediente);
		jTabbedPaneBusquedasIngrediente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProductoIngrediente= new GridBagLayout();
		gridaBagLayoutFK_IdProductoIngrediente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoIngrediente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoIngrediente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoIngrediente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoIngrediente.setLayout(gridaBagLayoutFK_IdProductoIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 0;
		jPanelFK_IdProductoIngrediente.add(jLabelid_productoFK_IdProductoIngrediente, gridBagConstraintsIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 1;
		jPanelFK_IdProductoIngrediente.add(jComboBoxid_productoFK_IdProductoIngrediente, gridBagConstraintsIngrediente);


		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 0;
		jPanelFK_IdProductoIngrediente.add(this.jButtonBuscarFK_IdProductoid_productoIngrediente, gridBagConstraintsIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 1;
		gridBagConstraintsIngrediente.gridx =1;
		jPanelFK_IdProductoIngrediente.add(jButtonFK_IdProductoIngrediente, gridBagConstraintsIngrediente);

		jTabbedPaneBusquedasIngrediente.addTab("3.-Por Producto ", jPanelFK_IdProductoIngrediente);
		jTabbedPaneBusquedasIngrediente.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdProductoRelacionIngrediente= new GridBagLayout();
		gridaBagLayoutFK_IdProductoRelacionIngrediente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoRelacionIngrediente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoRelacionIngrediente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoRelacionIngrediente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoRelacionIngrediente.setLayout(gridaBagLayoutFK_IdProductoRelacionIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 0;
		jPanelFK_IdProductoRelacionIngrediente.add(jLabelid_producto_relacionFK_IdProductoRelacionIngrediente, gridBagConstraintsIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 1;
		jPanelFK_IdProductoRelacionIngrediente.add(jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente, gridBagConstraintsIngrediente);


		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
		gridBagConstraintsIngrediente.gridy = 0;
		gridBagConstraintsIngrediente.gridx = 0;
		jPanelFK_IdProductoRelacionIngrediente.add(this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente, gridBagConstraintsIngrediente);

		gridBagConstraintsIngrediente = new GridBagConstraints();
		gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngrediente.gridy = 1;
		gridBagConstraintsIngrediente.gridx =1;
		jPanelFK_IdProductoRelacionIngrediente.add(jButtonFK_IdProductoRelacionIngrediente, gridBagConstraintsIngrediente);

		jTabbedPaneBusquedasIngrediente.addTab("4.-Por Producto Relacion ", jPanelFK_IdProductoRelacionIngrediente);
		jTabbedPaneBusquedasIngrediente.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIngrediente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIngrediente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIngrediente = new GridBagConstraints();						
			this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngrediente.gridx = 0;		
			//this.gridBagConstraintsIngrediente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIngrediente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarIngrediente, this.gridBagConstraintsIngrediente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsIngrediente.gridx = 0;		
		//this.gridBagConstraintsIngrediente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsIngrediente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsIngrediente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngrediente.gridx = 0;		
			this.gridBagConstraintsIngrediente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsIngrediente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasIngrediente, this.gridBagConstraintsIngrediente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesIngrediente, this.gridBagConstraintsIngrediente);								
		
		
		/*
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesIngrediente, this.gridBagConstraintsIngrediente);
		*/		
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIngrediente.gridx =0;
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIngrediente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIngrediente, this.gridBagConstraintsIngrediente);
				
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionIngrediente, this.gridBagConstraintsIngrediente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(IngredienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosIngrediente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIngrediente = new GridBagLayout();
			this.jPanelBusquedasParametrosIngrediente.setLayout(gridaBagLayoutBusquedasParametrosIngrediente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralIngrediente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIngrediente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngrediente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngrediente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIngrediente, this.gridBagConstraintsIngrediente);
			
			
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIngrediente, this.gridBagConstraintsIngrediente);
		
			
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIngrediente, this.gridBagConstraintsIngrediente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralIngrediente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoIngrediente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoIngrediente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoIngrediente.setName("jPanelReporteDinamicoIngrediente"); 
		
		this.jPanelReporteDinamicoIngrediente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIngrediente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIngrediente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoIngrediente.setLayout(gridaBagLayoutReporteDinamicoIngrediente);
		
		
		this.jInternalFrameReporteDinamicoIngrediente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoIngrediente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIngrediente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoIngrediente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoIngrediente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoIngrediente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoIngrediente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoIngrediente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoIngrediente.setResizable(true);
	    this.jInternalFrameReporteDinamicoIngrediente.setClosable(true);
	    this.jInternalFrameReporteDinamicoIngrediente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoIngrediente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIngrediente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIngrediente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingredientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteIngrediente = new JLabelMe();

		this.jLabelColumnasSelectReporteIngrediente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIngrediente.add(this.jLabelColumnasSelectReporteIngrediente, this.gridBagConstraintsIngrediente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteIngrediente = new JList<Reporte>();
		this.jListColumnasSelectReporteIngrediente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteIngrediente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteIngrediente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIngrediente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIngrediente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteIngrediente=new JScrollPane(this.jListColumnasSelectReporteIngrediente);
			
			this.jScrollColumnasSelectReporteIngrediente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIngrediente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIngrediente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoIngrediente.add(this.jListColumnasSelectReporteIngrediente, this.gridBagConstraintsIngrediente);
		this.jPanelReporteDinamicoIngrediente.add(this.jScrollColumnasSelectReporteIngrediente, this.gridBagConstraintsIngrediente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteIngrediente = new JLabelMe();

		this.jLabelRelacionesSelectReporteIngrediente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteIngrediente = new JList<Reporte>();
		this.jListRelacionesSelectReporteIngrediente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteIngrediente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteIngrediente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIngrediente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIngrediente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteIngrediente=new JScrollPane(this.jListRelacionesSelectReporteIngrediente);
			
			this.jScrollRelacionesSelectReporteIngrediente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIngrediente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIngrediente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoIngrediente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoIngrediente = new JComboBoxMe();
		this.jListColumnasValoresGraficoIngrediente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoIngrediente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoIngrediente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoIngrediente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIngrediente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIngrediente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoIngrediente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoIngrediente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoIngrediente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIngrediente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIngrediente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoIngrediente = new JLabelMe();

		this.jLabelConGraficoDinamicoIngrediente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIngrediente.add(this.jLabelConGraficoDinamicoIngrediente, this.gridBagConstraintsIngrediente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoIngrediente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoIngrediente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoIngrediente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoIngrediente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoIngrediente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoIngrediente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngrediente.add(this.jCheckBoxConGraficoDinamicoIngrediente, this.gridBagConstraintsIngrediente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoIngrediente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoIngrediente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIngrediente.add(this.jLabelColumnaCategoriaGraficoIngrediente, this.gridBagConstraintsIngrediente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoIngrediente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoIngrediente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoIngrediente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoIngrediente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoIngrediente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoIngrediente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoIngrediente.add(this.jComboBoxColumnaCategoriaGraficoIngrediente, this.gridBagConstraintsIngrediente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorIngrediente = new JLabelMe();

		this.jLabelColumnaCategoriaValorIngrediente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngrediente.add(this.jLabelColumnaCategoriaValorIngrediente, this.gridBagConstraintsIngrediente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorIngrediente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorIngrediente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorIngrediente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorIngrediente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorIngrediente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorIngrediente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoIngrediente.add(this.jComboBoxColumnaCategoriaValorIngrediente, this.gridBagConstraintsIngrediente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoIngrediente = new JLabelMe();

		this.jLabelColumnasValoresGraficoIngrediente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngrediente.add(this.jLabelColumnasValoresGraficoIngrediente, this.gridBagConstraintsIngrediente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoIngrediente = new JList<Reporte>();
		this.jListColumnasValoresGraficoIngrediente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoIngrediente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoIngrediente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoIngrediente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoIngrediente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoIngrediente=new JScrollPane(this.jListColumnasValoresGraficoIngrediente);
			
			this.jScrollColumnasValoresGraficoIngrediente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoIngrediente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoIngrediente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoIngrediente.add(this.jListColumnasSelectReporteIngrediente, this.gridBagConstraintsIngrediente);
		this.jPanelReporteDinamicoIngrediente.add(this.jScrollColumnasValoresGraficoIngrediente, this.gridBagConstraintsIngrediente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoIngrediente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoIngrediente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngrediente.add(this.jLabelTiposGraficosReportesDinamicoIngrediente, this.gridBagConstraintsIngrediente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoIngrediente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoIngrediente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoIngrediente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoIngrediente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoIngrediente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoIngrediente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngrediente.add(this.jComboBoxTiposGraficosReportesDinamicoIngrediente, this.gridBagConstraintsIngrediente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoIngrediente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoIngrediente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngrediente.add(this.jLabelGenerarExcelReporteDinamicoIngrediente, this.gridBagConstraintsIngrediente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoIngrediente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoIngrediente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoIngrediente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoIngrediente.setToolTipText("Generar EXCEL"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoIngrediente.add(this.jButtonGenerarExcelReporteDinamicoIngrediente, this.gridBagConstraintsIngrediente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngrediente.add(this.jComboBoxTiposReportesDinamicoIngrediente, this.gridBagConstraintsIngrediente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoIngrediente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoIngrediente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngrediente.add(this.jLabelTiposArchivoReporteDinamicoIngrediente, this.gridBagConstraintsIngrediente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngrediente.add(this.jComboBoxTiposArchivosReportesDinamicoIngrediente, this.gridBagConstraintsIngrediente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoIngrediente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoIngrediente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoIngrediente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoIngrediente.setToolTipText("Generar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngrediente.add(this.jButtonGenerarReporteDinamicoIngrediente, this.gridBagConstraintsIngrediente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoIngrediente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoIngrediente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoIngrediente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoIngrediente.setToolTipText("Cancelar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngrediente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngrediente.add(this.jButtonCerrarReporteDinamicoIngrediente, this.gridBagConstraintsIngrediente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalIngrediente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoIngrediente= new JScrollPane(jPanelReporteDinamicoIngrediente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoIngrediente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIngrediente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIngrediente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingredientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsIngrediente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoIngrediente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoIngrediente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalIngrediente);
		this.jInternalFrameReporteDinamicoIngrediente.getContentPane().add(this.jScrollPanelReporteDinamicoIngrediente, this.gridBagConstraintsIngrediente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionIngrediente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionIngrediente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionIngrediente.setName("jPanelImportacionIngrediente"); 
		
		this.jPanelImportacionIngrediente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIngrediente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIngrediente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionIngrediente.setLayout(gridaBagLayoutImportacionIngrediente);
		
		
		this.jInternalFrameImportacionIngrediente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionIngrediente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionIngrediente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIngrediente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionIngrediente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIngrediente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIngrediente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionIngrediente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIngrediente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIngrediente.setResizable(true);
	    this.jInternalFrameImportacionIngrediente.setClosable(true);
	    this.jInternalFrameImportacionIngrediente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionIngrediente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIngrediente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIngrediente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionIngrediente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIngrediente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIngrediente.setResizable(true);
	    this.jInternalFrameImportacionIngrediente.setClosable(true);
	    this.jInternalFrameImportacionIngrediente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionIngrediente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIngrediente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIngrediente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingredientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionIngrediente = new JLabelMe();

		this.jLabelArchivoImportacionIngrediente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYImportacion;		
		this.gridBagConstraintsIngrediente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIngrediente.add(this.jLabelArchivoImportacionIngrediente, this.gridBagConstraintsIngrediente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionIngrediente = new JFileChooser();		
		this.jFileChooserImportacionIngrediente.setToolTipText("ESCOGER ARCHIVO"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionIngrediente = new JButtonMe();
		this.jButtonAbrirImportacionIngrediente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionIngrediente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionIngrediente.setToolTipText("Generar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYImportacion;
		this.gridBagConstraintsIngrediente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngrediente.add(this.jButtonAbrirImportacionIngrediente, this.gridBagConstraintsIngrediente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionIngrediente = new JLabelMe();

		this.jLabelPathArchivoImportacionIngrediente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYImportacion;		
		this.gridBagConstraintsIngrediente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIngrediente.add(this.jLabelPathArchivoImportacionIngrediente, this.gridBagConstraintsIngrediente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionIngrediente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionIngrediente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIngrediente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIngrediente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYImportacion;
		this.gridBagConstraintsIngrediente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngrediente.add(this.jTextFieldPathArchivoImportacionIngrediente, this.gridBagConstraintsIngrediente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionIngrediente = new JButtonMe();
		this.jButtonGenerarImportacionIngrediente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionIngrediente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionIngrediente.setToolTipText("Generar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYImportacion;
		this.gridBagConstraintsIngrediente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngrediente.add(this.jButtonGenerarImportacionIngrediente, this.gridBagConstraintsIngrediente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionIngrediente = new JButtonMe();
		this.jButtonCerrarImportacionIngrediente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionIngrediente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionIngrediente.setToolTipText("Cancelar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = iPosYImportacion;
		this.gridBagConstraintsIngrediente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngrediente.add(this.jButtonCerrarImportacionIngrediente, this.gridBagConstraintsIngrediente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalIngrediente = new GridBagLayout();
		
		this.jScrollPanelImportacionIngrediente= new JScrollPane(jPanelImportacionIngrediente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy =iPosYImportacion;
		this.gridBagConstraintsIngrediente.gridx =iPosXImportacion;
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionIngrediente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionIngrediente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalIngrediente);
		this.jInternalFrameImportacionIngrediente.getContentPane().add(this.jScrollPanelImportacionIngrediente, this.gridBagConstraintsIngrediente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByIngrediente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByIngrediente = new JButtonMe();
			this.jButtonAbrirOrderByIngrediente.setText("Orden");
			this.jButtonAbrirOrderByIngrediente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIngrediente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByIngrediente";
			inputMap = this.jButtonAbrirOrderByIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByIngrediente"));
		
		
			GridBagLayout gridaBagLayoutOrderByIngrediente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByIngrediente.setName("jPanelOrderByIngrediente"); 
			
			this.jPanelOrderByIngrediente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIngrediente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIngrediente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByIngrediente.setLayout(gridaBagLayoutOrderByIngrediente);
			
			
			this.jTableDatosIngredienteOrderBy = new JTableMe();        
			this.jTableDatosIngredienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosIngredienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosIngredienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosIngredienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosIngredienteOrderBy.setViewportView(this.jTableDatosIngredienteOrderBy);
			this.jTableDatosIngredienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosIngredienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByIngrediente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByIngrediente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByIngrediente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteIngrediente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByIngrediente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByIngrediente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByIngrediente.setTitle("Orden");
			this.jInternalFrameOrderByIngrediente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByIngrediente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByIngrediente.setResizable(true);
			this.jInternalFrameOrderByIngrediente.setClosable(true);
			this.jInternalFrameOrderByIngrediente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByIngrediente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIngrediente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIngrediente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingredientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsIngrediente.gridx =iPosXOrderBy;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsIngrediente.ipady =150;
				
			this.jPanelOrderByIngrediente.add(jScrollPanelDatosIngredienteOrderBy, this.gridBagConstraintsIngrediente);//this.jTableDatosIngredienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByIngrediente = new JButtonMe();
			this.jButtonCerrarOrderByIngrediente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByIngrediente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByIngrediente.setToolTipText("Cancelar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsIngrediente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByIngrediente.add(this.jButtonCerrarOrderByIngrediente, this.gridBagConstraintsIngrediente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalIngrediente = new GridBagLayout();
			
			this.jScrollPanelOrderByIngrediente= new JScrollPane(jPanelOrderByIngrediente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy =iPosYOrderBy;
			this.gridBagConstraintsIngrediente.gridx =iPosXOrderBy;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByIngrediente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByIngrediente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalIngrediente);
			
			this.jInternalFrameOrderByIngrediente.getContentPane().add(this.jScrollPanelOrderByIngrediente, this.gridBagConstraintsIngrediente);			
		
		} else {
			this.jButtonAbrirOrderByIngrediente = new JButtonMe();
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
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.ingredienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosIngrediente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosIngrediente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosIngrediente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosIngrediente.getRowHeight();//IngredienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > IngredienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIngrediente.isSelected()) {
					iHeightTable=IngredienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IngredienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IngredienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > IngredienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIngrediente.isSelected()) {
					iHeightTable=IngredienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IngredienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IngredienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosIngrediente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIngrediente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIngrediente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosIngrediente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIngrediente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIngrediente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByIngrediente!=null && this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy()!=null) {
			//if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByIngrediente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByIngrediente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByIngrediente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosIngrediente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIngrediente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIngrediente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=ingredienteLogic.getIngredientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingredientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Ingrediente> TraerIngredienteBeans(List<Ingrediente> ingredientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(Ingrediente ingrediente:ingredientes) {
					
				if(!(IngredienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || IngredienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ingrediente.setsDetalleGeneralEntityReporte(IngredienteConstantesFunciones.getIngredienteDescripcion(ingrediente));
										
						
					
						
					
				} else  {
							
					//ingrediente.setsDetalleGeneralEntityReporte(ingrediente.getsDetalleGeneralEntityReporte());
										
				}
				
				//ingredientebeans.add(ingredientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ingredientes;
    }
	//PARA REPORTES FIN
}
