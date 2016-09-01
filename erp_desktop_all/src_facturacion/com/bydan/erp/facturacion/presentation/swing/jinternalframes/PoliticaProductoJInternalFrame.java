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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.PoliticaProductoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class PoliticaProductoJInternalFrame extends PoliticaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPoliticaProducto;
	
	protected JMenuBar jmenuBarPoliticaProducto;
	
	protected JMenu jmenuPoliticaProducto;
	protected JMenu jmenuDatosPoliticaProducto;
	protected JMenu jmenuArchivoPoliticaProducto;
	protected JMenu jmenuAccionesPoliticaProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPoliticaProducto;	
	protected GridBagConstraints gridBagConstraintsPoliticaProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PoliticaProductoDetalleFormJInternalFrame jInternalFrameDetalleFormPoliticaProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPoliticaProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPoliticaProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public PoliticaProductoSessionBean politicaproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PoliticaProducto> politicaproductos;		
	public List<PoliticaProducto> politicaproductosEliminados;	
	public List<PoliticaProducto> politicaproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPoliticaProducto;		
	protected JButton jButtonAbrirOrderByPoliticaProducto;
	
	
	//protected JPanel jPanelOrderByPoliticaProducto;
	//public JScrollPane jScrollPanelOrderByPoliticaProducto;	
	//protected JButton jButtonCerrarOrderByPoliticaProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PoliticaProductoLogic politicaproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPoliticaProducto;
	public JScrollPane jScrollPanelDatosEdicionPoliticaProducto;
	public JScrollPane jScrollPanelDatosGeneralPoliticaProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosPoliticaProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPoliticaProducto;
	//public JScrollPane jScrollPanelImportacionPoliticaProducto;
	
	
	
	protected JPanel jPanelAccionesPoliticaProducto;
	
    protected JPanel jPanelPaginacionPoliticaProducto;
    protected JPanel jPanelParametrosReportesPoliticaProducto;
	protected JPanel jPanelParametrosReportesAccionesPoliticaProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PoliticaProducto;
	protected JPanel jPanelParametrosAuxiliar2PoliticaProducto;
	protected JPanel jPanelParametrosAuxiliar3PoliticaProducto;
	protected JPanel jPanelParametrosAuxiliar4PoliticaProducto;
	//protected JPanel jPanelParametrosAuxiliar5PoliticaProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoPoliticaProducto;
	//protected JPanel jPanelImportacionPoliticaProducto;
	
	
	public JTable jTableDatosPoliticaProducto;
	
	
	
	//public JTable jTableDatosPoliticaProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPoliticaProducto;
	protected JButton jButtonDuplicarPoliticaProducto;
	protected JButton jButtonCopiarPoliticaProducto;
	protected JButton jButtonVerFormPoliticaProducto;
	protected JButton jButtonNuevoRelacionesPoliticaProducto;
	protected JButton jButtonModificarPoliticaProducto;
	
    protected JButton jButtonGuardarCambiosTablaPoliticaProducto;
	protected JButton jButtonCerrarPoliticaProducto;
	
	
	protected JButton jButtonRecargarInformacionPoliticaProducto;
	protected JButton jButtonProcesarInformacionPoliticaProducto;
	
	
	protected JButton jButtonAnterioresPoliticaProducto;
	protected JButton jButtonSiguientesPoliticaProducto;
	protected JButton jButtonNuevoGuardarCambiosPoliticaProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPoliticaProducto;
	//protected JButton jButtonCerrarReporteDinamicoPoliticaProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoPoliticaProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionPoliticaProducto;
	//protected JButton jButtonGenerarImportacionPoliticaProducto;
	//protected JButton jButtonCerrarImportacionPoliticaProducto;
	//protected JFileChooser jFileChooserImportacionPoliticaProducto;
	//protected File fileImportacionPoliticaProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPoliticaProducto;
	protected JButton jButtonDuplicarToolBarPoliticaProducto;
	protected JButton jButtonNuevoRelacionesToolBarPoliticaProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarPoliticaProducto;
	protected JButton jButtonCopiarToolBarPoliticaProducto;
	protected JButton jButtonVerFormToolBarPoliticaProducto;
	public JButton jButtonGuardarCambiosTablaToolBarPoliticaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarPoliticaProducto;
	protected JButton jButtonCerrarToolBarPoliticaProducto;
	
	protected JButton jButtonRecargarInformacionToolBarPoliticaProducto;
	protected JButton jButtonProcesarInformacionToolBarPoliticaProducto;
	protected JButton jButtonAnterioresToolBarPoliticaProducto;
	protected JButton jButtonSiguientesToolBarPoliticaProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarPoliticaProducto;
	protected JButton jButtonAbrirOrderByToolBarPoliticaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPoliticaProducto;
	protected JMenuItem jMenuItemDuplicarPoliticaProducto;
	protected JMenuItem jMenuItemNuevoRelacionesPoliticaProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPoliticaProducto;
	protected JMenuItem jMenuItemCopiarPoliticaProducto;
	protected JMenuItem jMenuItemVerFormPoliticaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPoliticaProducto;
	protected JMenuItem jMenuItemCerrarPoliticaProducto;
	protected JMenuItem jMenuItemDetalleCerrarPoliticaProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPoliticaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPoliticaProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionPoliticaProducto;
	protected JMenuItem jMenuItemProcesarInformacionPoliticaProducto;
	protected JMenuItem jMenuItemAnterioresPoliticaProducto;
	protected JMenuItem jMenuItemSiguientesPoliticaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPoliticaProducto;
	protected JMenuItem jMenuItemAbrirOrderByPoliticaProducto;
	protected JMenuItem jMenuItemMostrarOcultarPoliticaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPoliticaProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPoliticaProducto;
	protected JCheckBox jCheckBoxSeleccionadosPoliticaProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPoliticaProducto;
	protected JCheckBox jCheckBoxConGraficoReportePoliticaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPoliticaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPoliticaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPoliticaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPoliticaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPoliticaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPoliticaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPoliticaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPoliticaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPoliticaProducto;
	protected JTextField jTextFieldValorCampoGeneralPoliticaProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePoliticaProducto;
	//public JList<Reporte> jListColumnasSelectReportePoliticaProducto;
	//public JScrollPane jScrollColumnasSelectReportePoliticaProducto;
	
	//public JLabel jLabelRelacionesSelectReportePoliticaProducto;
	//public JList<Reporte> jListRelacionesSelectReportePoliticaProducto;
	//public JScrollPane jScrollRelacionesSelectReportePoliticaProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPoliticaProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPoliticaProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPoliticaProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoPoliticaProducto;
	
		
	//public JLabel jLabelArchivoImportacionPoliticaProducto;	
	//public JLabel jLabelPathArchivoImportacionPoliticaProducto;
	//protected JTextField jTextFieldPathArchivoImportacionPoliticaProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPoliticaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPoliticaProducto;
	
	//public JLabel jLabelColumnaCategoriaValorPoliticaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPoliticaProducto;
	
	//public JLabel jLabelColumnasValoresGraficoPoliticaProducto;
	//public JList<Reporte> jListColumnasValoresGraficoPoliticaProducto;
	//public JScrollPane jScrollColumnasValoresGraficoPoliticaProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPoliticaProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPoliticaProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPoliticaProducto;
	public JPanel jPanelFK_IdBodegaPoliticaProducto;
	public JButton jButtonFK_IdBodegaPoliticaProducto;
	public JPanel jPanelFK_IdProductoPoliticaProducto;
	public JButton jButtonFK_IdProductoPoliticaProducto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaPoliticaProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaPoliticaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaPoliticaProducto;
	public JButton jButtonid_bodegaFK_IdBodegaPoliticaProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaPoliticaProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaPoliticaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoPoliticaProducto;
	public JLabel jLabelid_productoFK_IdProductoPoliticaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoPoliticaProducto;
	public JButton jButtonid_productoFK_IdProductoPoliticaProducto= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPoliticaProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoPoliticaProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoPoliticaProducto;
	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PoliticaProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPoliticaProducto)	{
		this.jButtonRecargarInformacionPoliticaProducto = jButtonRecargarInformacionPoliticaProducto;
	}
	
	public JButton getjButtonProcesarInformacionPoliticaProducto() {
		return this.jButtonProcesarInformacionPoliticaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPoliticaProducto)	{
		this.jButtonProcesarInformacionPoliticaProducto = jButtonProcesarInformacionPoliticaProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionPoliticaProducto() {
		return this.jButtonRecargarInformacionPoliticaProducto;
	}
	
	
	public List<PoliticaProducto> getpoliticaproductos() {
		return this.politicaproductos;
	}

	public void setpoliticaproductos(List<PoliticaProducto> politicaproductos) {
		this.politicaproductos = politicaproductos;
	}
	
	public List<PoliticaProducto> getpoliticaproductosAux() {
		return this.politicaproductosAux;
	}

	public void setpoliticaproductosAux(List<PoliticaProducto> politicaproductosAux) {
		this.politicaproductosAux = politicaproductosAux;
	}
	
	public List<PoliticaProducto> getpoliticaproductosEliminados() {
		return this.politicaproductosEliminados;
	}

	public void setPoliticaProductosEliminados(List<PoliticaProducto> politicaproductosEliminados) {
		this.politicaproductosEliminados = politicaproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPoliticaProducto() {
		return jComboBoxTiposSeleccionarPoliticaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPoliticaProducto(
			JComboBox jComboBoxTiposSeleccionarPoliticaProducto) {
		this.jComboBoxTiposSeleccionarPoliticaProducto = jComboBoxTiposSeleccionarPoliticaProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPoliticaProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPoliticaProducto() {
		return jTextFieldValorCampoGeneralPoliticaProducto;
	}

	public void setjTextFieldValorCampoGeneralPoliticaProducto(
			JTextField jTextFieldValorCampoGeneralPoliticaProducto) {
		this.jTextFieldValorCampoGeneralPoliticaProducto = jTextFieldValorCampoGeneralPoliticaProducto;
	}

	public void setBorderResaltarValorCampoGeneralPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPoliticaProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPoliticaProducto() {
		return this.jCheckBoxSeleccionarTodosPoliticaProducto;
	}

	public void setjCheckBoxSeleccionarTodosPoliticaProducto(
			JCheckBox jCheckBoxSeleccionarTodosPoliticaProducto) {
		this.jCheckBoxSeleccionarTodosPoliticaProducto = jCheckBoxSeleccionarTodosPoliticaProducto;
	}

	public void setBorderResaltarSeleccionarTodosPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPoliticaProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPoliticaProducto() {
		return this.jCheckBoxSeleccionadosPoliticaProducto;
	}

	public void setjCheckBoxSeleccionadosPoliticaProducto(
			JCheckBox jCheckBoxSeleccionadosPoliticaProducto) {
		this.jCheckBoxSeleccionadosPoliticaProducto = jCheckBoxSeleccionadosPoliticaProducto;
	}
	
	public void setBorderResaltarSeleccionadosPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPoliticaProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPoliticaProducto() {
		return this.jComboBoxTiposArchivosReportesPoliticaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPoliticaProducto(
			JComboBox jComboBoxTiposArchivosReportesPoliticaProducto) {
		this.jComboBoxTiposArchivosReportesPoliticaProducto = jComboBoxTiposArchivosReportesPoliticaProducto;
	}

	public void setBorderResaltarTiposArchivosReportesPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPoliticaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPoliticaProducto() {
		return this.jComboBoxTiposReportesPoliticaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPoliticaProducto(
			JComboBox jComboBoxTiposReportesPoliticaProducto) {
		this.jComboBoxTiposReportesPoliticaProducto = jComboBoxTiposReportesPoliticaProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPoliticaProducto() {
	//	return jComboBoxTiposReportesDinamicoPoliticaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPoliticaProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoPoliticaProducto) {
	//	this.jComboBoxTiposReportesDinamicoPoliticaProducto = jComboBoxTiposReportesDinamicoPoliticaProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPoliticaProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoPoliticaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPoliticaProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPoliticaProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPoliticaProducto = jComboBoxTiposArchivosReportesDinamicoPoliticaProducto;
	//}
	
	public void setBorderResaltarTiposReportesPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPoliticaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPoliticaProducto() {
		return this.jComboBoxTiposGraficosReportesPoliticaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPoliticaProducto(
			JComboBox jComboBoxTiposGraficosReportesPoliticaProducto) {
		this.jComboBoxTiposGraficosReportesPoliticaProducto = jComboBoxTiposGraficosReportesPoliticaProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPoliticaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPoliticaProducto() {
		return this.jComboBoxTiposPaginacionPoliticaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPoliticaProducto(
			JComboBox jComboBoxTiposPaginacionPoliticaProducto) {
		this.jComboBoxTiposPaginacionPoliticaProducto = jComboBoxTiposPaginacionPoliticaProducto;
	}
	
	public void setBorderResaltarTiposPaginacionPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPoliticaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPoliticaProducto() {
		return this.jComboBoxTiposRelacionesPoliticaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPoliticaProducto() {
		return this.jComboBoxTiposAccionesPoliticaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPoliticaProducto(
			JComboBox jComboBoxTiposRelacionesPoliticaProducto) {
		this.jComboBoxTiposRelacionesPoliticaProducto = jComboBoxTiposRelacionesPoliticaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPoliticaProducto(
			JComboBox jComboBoxTiposAccionesPoliticaProducto) {
		this.jComboBoxTiposAccionesPoliticaProducto = jComboBoxTiposAccionesPoliticaProducto;
	}
	
	public void setBorderResaltarTiposRelacionesPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPoliticaProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPoliticaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPoliticaProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPoliticaProducto() {
	//	return jCheckBoxConGraficoDinamicoPoliticaProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoPoliticaProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoPoliticaProducto) {
	//	this.jCheckBoxConGraficoDinamicoPoliticaProducto = jCheckBoxConGraficoDinamicoPoliticaProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPoliticaProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPoliticaProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPoliticaProducto .setBorder(borderResaltar);		
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
		this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
		
		this.politicaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.politicaproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PoliticaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PoliticaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PoliticaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PoliticaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PoliticaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Politica Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		PoliticaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PoliticaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPoliticaProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"nuevo","nuevo","Nuevo"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"duplicar","duplicar","Duplicar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"copiar","copiar","Copiar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"ver_form","ver_form","Ver"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"recargar","recargar","Recargar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPoliticaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPoliticaProducto,this.jTtoolBarPoliticaProducto,
							"cerrar","cerrar","Salir"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPoliticaProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPoliticaProducto;
			
				this.jButtonProcesarInformacionToolBarPoliticaProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPoliticaProducto;
				
		//protected JButton jButtonModificarToolBarPoliticaProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPoliticaProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPoliticaProducto=new JMenuMe("General");
		this.jmenuArchivoPoliticaProducto=new JMenuMe("Archivo");
		this.jmenuAccionesPoliticaProducto=new JMenuMe("Acciones");
		this.jmenuDatosPoliticaProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPoliticaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPoliticaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPoliticaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPoliticaProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPoliticaProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPoliticaProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPoliticaProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPoliticaProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPoliticaProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPoliticaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPoliticaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPoliticaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPoliticaProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPoliticaProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPoliticaProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPoliticaProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPoliticaProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPoliticaProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPoliticaProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPoliticaProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPoliticaProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPoliticaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPoliticaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPoliticaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPoliticaProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPoliticaProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPoliticaProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPoliticaProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPoliticaProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPoliticaProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPoliticaProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPoliticaProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPoliticaProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPoliticaProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPoliticaProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPoliticaProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPoliticaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPoliticaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPoliticaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPoliticaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPoliticaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPoliticaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPoliticaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPoliticaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPoliticaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPoliticaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPoliticaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPoliticaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPoliticaProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPoliticaProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPoliticaProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPoliticaProducto.add(this.jMenuItemCerrarPoliticaProducto);
			
			this.jmenuAccionesPoliticaProducto.add(this.jMenuItemNuevoPoliticaProducto);
			this.jmenuAccionesPoliticaProducto.add(this.jMenuItemNuevoGuardarCambiosPoliticaProducto);
			this.jmenuAccionesPoliticaProducto.add(this.jMenuItemNuevoRelacionesPoliticaProducto);
			this.jmenuAccionesPoliticaProducto.add(this.jMenuItemGuardarCambiosTablaPoliticaProducto);		
			this.jmenuAccionesPoliticaProducto.add(this.jMenuItemDuplicarPoliticaProducto);		
			this.jmenuAccionesPoliticaProducto.add(this.jMenuItemCopiarPoliticaProducto);		
			this.jmenuAccionesPoliticaProducto.add(this.jMenuItemVerFormPoliticaProducto);		
			
			this.jmenuDatosPoliticaProducto.add(this.jMenuItemRecargarInformacionPoliticaProducto);				
			this.jmenuDatosPoliticaProducto.add(this.jMenuItemAnterioresPoliticaProducto);				
			this.jmenuDatosPoliticaProducto.add(this.jMenuItemSiguientesPoliticaProducto);				
			this.jmenuDatosPoliticaProducto.add(this.jMenuItemAbrirOrderByPoliticaProducto);				
			this.jmenuDatosPoliticaProducto.add(this.jMenuItemMostrarOcultarPoliticaProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPoliticaProducto.add(this.jMenuItemGuardarCambiosPoliticaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPoliticaProducto.add(this.jmenuArchivoPoliticaProducto);		
			this.jmenuBarPoliticaProducto.add(this.jmenuAccionesPoliticaProducto);		
			this.jmenuBarPoliticaProducto.add(this.jmenuDatosPoliticaProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPoliticaProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPoliticaProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaPoliticaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaPoliticaProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaPoliticaProducto= new JButtonMe();
		this.jButtonFK_IdBodegaPoliticaProducto.setText("Buscar");
		this.jButtonFK_IdBodegaPoliticaProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaPoliticaProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaPoliticaProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaPoliticaProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaPoliticaProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaPoliticaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaPoliticaProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaPoliticaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoPoliticaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoPoliticaProducto.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoPoliticaProducto= new JButtonMe();
		this.jButtonFK_IdProductoPoliticaProducto.setText("Buscar");
		this.jButtonFK_IdProductoPoliticaProducto.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoPoliticaProducto,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoPoliticaProducto = new JLabelMe();
		jLabelid_productoFK_IdProductoPoliticaProducto.setText("Producto :");
		jLabelid_productoFK_IdProductoPoliticaProducto.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoPoliticaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoPoliticaProducto= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoPoliticaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto.setFocusable(false);


		this.jTabbedPaneBusquedasPoliticaProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasPoliticaProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPoliticaProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPoliticaProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPoliticaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPoliticaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePoliticaProducto = new PoliticaProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Politica Producto DATOS");
			this.jInternalFrameDetalleFormPoliticaProducto = new PoliticaProductoDetalleFormJInternalFrame(jDesktopPane,this.politicaproductoSessionBean.getConGuardarRelaciones(),this.politicaproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPoliticaProducto = null;//new PoliticaProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPoliticaProducto= new GridBagLayout();
		
		
		this.jTableDatosPoliticaProducto = new JTableMe();      
		
		String sToolTipPoliticaProducto="";
		sToolTipPoliticaProducto=PoliticaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPoliticaProducto+="(Facturacion.PoliticaProducto)";
		}
		
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPoliticaProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPoliticaProducto.setToolTipText(sToolTipPoliticaProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPoliticaProducto);
		this.jTableDatosPoliticaProducto.setAutoCreateRowSorter(true);
		this.jTableDatosPoliticaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPoliticaProducto.setRowSelectionAllowed(true);
		this.jTableDatosPoliticaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPoliticaProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPoliticaProducto = new JButtonMe();
		this.jButtonDuplicarPoliticaProducto = new JButtonMe();
		this.jButtonCopiarPoliticaProducto = new JButtonMe();
		this.jButtonVerFormPoliticaProducto = new JButtonMe();
		this.jButtonNuevoRelacionesPoliticaProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPoliticaProducto = new JButtonMe();
		this.jButtonCerrarPoliticaProducto = new JButtonMe();
		
		this.jScrollPanelDatosPoliticaProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralPoliticaProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Politica Producto";
		
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosPoliticaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPoliticaProducto.setToolTipText("Acciones");
        this.jPanelAccionesPoliticaProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPoliticaProducto=new ReporteDinamicoJInternalFrame(PoliticaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPoliticaProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPoliticaProducto=new ImportacionJInternalFrame(PoliticaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPoliticaProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPoliticaProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByPoliticaProducto.setText("Orden");
		this.jButtonAbrirOrderByPoliticaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPoliticaProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPoliticaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaProducto,false,this);
			
			//this.cargarOrderByPoliticaProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPoliticaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaProducto,true,this);
			
			//this.cargarOrderByPoliticaProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPoliticaProducto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosPoliticaProducto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosPoliticaProducto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosPoliticaProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPoliticaProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPoliticaProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPoliticaProducto.setText("Nuevo");
		this.jButtonDuplicarPoliticaProducto.setText("Duplicar");
		this.jButtonCopiarPoliticaProducto.setText("Copiar");
		this.jButtonVerFormPoliticaProducto.setText("Ver");
		this.jButtonNuevoRelacionesPoliticaProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPoliticaProducto.setText("Guardar");
		this.jButtonCerrarPoliticaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPoliticaProducto,"nuevo_button","Nuevo",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPoliticaProducto,"duplicar_button","Duplicar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPoliticaProducto,"copiar_button","Copiar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPoliticaProducto,"ver_form","Ver",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPoliticaProducto,"nuevorelaciones_button","Nuevo Rel",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPoliticaProducto,"guardarcambiostabla_button","Guardar",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPoliticaProducto,"cerrar_button","Salir",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPoliticaProducto.setToolTipText("Nuevo"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPoliticaProducto.setToolTipText("Duplicar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPoliticaProducto.setToolTipText("Copiar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPoliticaProducto.setToolTipText("Ver"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPoliticaProducto.setToolTipText("Nuevo Rel"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPoliticaProducto.setToolTipText("Guardar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPoliticaProducto.setToolTipText("Salir"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPoliticaProducto";
		inputMap = this.jButtonNuevoPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPoliticaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPoliticaProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarPoliticaProducto";
		inputMap = this.jButtonDuplicarPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPoliticaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPoliticaProducto"));
		
		//COPIAR
		sMapKey = "CopiarPoliticaProducto";
		inputMap = this.jButtonCopiarPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPoliticaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPoliticaProducto"));
		
		//VEr FORM
		sMapKey = "VerFormPoliticaProducto";
		inputMap = this.jButtonVerFormPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPoliticaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPoliticaProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPoliticaProducto";
		inputMap = this.jButtonNuevoRelacionesPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPoliticaProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPoliticaProducto";
		inputMap = this.jButtonModificarPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPoliticaProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPoliticaProducto";
		inputMap = this.jButtonCerrarPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPoliticaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPoliticaProducto";
		inputMap = this.jButtonGuardarCambiosTablaPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPoliticaProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PoliticaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PoliticaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PoliticaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PoliticaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PoliticaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPoliticaProducto.setName("jPanelParametrosReportesPoliticaProducto"); 
		
		this.jPanelParametrosReportesAccionesPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPoliticaProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPoliticaProducto.setName("jPanelParametrosReportesAccionesPoliticaProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPoliticaProducto = new JButtonMe();
		this.jButtonRecargarInformacionPoliticaProducto.setText("Recargar");
		this.jButtonRecargarInformacionPoliticaProducto.setToolTipText("Recargar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPoliticaProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPoliticaProducto = new JButtonMe();
		this.jButtonProcesarInformacionPoliticaProducto.setText("Procesar");
		this.jButtonProcesarInformacionPoliticaProducto.setToolTipText("Procesar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPoliticaProducto.setVisible(false);
			
		this.jButtonProcesarInformacionPoliticaProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPoliticaProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPoliticaProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPoliticaProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaProducto.setText("TIPO");       
		this.jComboBoxTiposReportesPoliticaProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPoliticaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPoliticaProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionPoliticaProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPoliticaProducto.setText("Accion");
		this.jComboBoxTiposRelacionesPoliticaProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPoliticaProducto.setText("Accion");
		this.jComboBoxTiposAccionesPoliticaProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPoliticaProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPoliticaProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarPoliticaProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPoliticaProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPoliticaProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPoliticaProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPoliticaProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPoliticaProducto = new JLabelMe();
		
		this.jLabelAccionesPoliticaProducto.setText("Acciones");		
		this.jLabelAccionesPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPoliticaProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPoliticaProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPoliticaProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPoliticaProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPoliticaProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPoliticaProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPoliticaProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPoliticaProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPoliticaProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePoliticaProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePoliticaProducto.setText("Graf.");
		this.jCheckBoxConGraficoReportePoliticaProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPoliticaProducto = new JButtonMe();
		//this.jButtonAnterioresPoliticaProducto.setText("<<");
        this.jButtonAnterioresPoliticaProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPoliticaProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPoliticaProducto = new JButtonMe();
		//this.jButtonSiguientesPoliticaProducto.setText(">>");
        this.jButtonSiguientesPoliticaProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPoliticaProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPoliticaProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPoliticaProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosPoliticaProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPoliticaProducto,"nuevoguardarcambios_button","Nue",this.politicaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPoliticaProducto";
		inputMap = this.jButtonNuevoGuardarCambiosPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPoliticaProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPoliticaProducto";
		inputMap = this.jButtonRecargarInformacionPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPoliticaProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPoliticaProducto";
		inputMap = this.jButtonSiguientesPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPoliticaProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPoliticaProducto";
		inputMap = this.jButtonAnterioresPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPoliticaProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPoliticaProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPoliticaProducto.setMinimumSize(new Dimension(this.getWidth(),PoliticaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPoliticaProducto.setMaximumSize(new Dimension(this.getWidth(),PoliticaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPoliticaProducto.setPreferredSize(new Dimension(this.getWidth(),PoliticaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPoliticaProducto = new GridBagLayout();

			this.jPanelPaginacionPoliticaProducto.setLayout(gridaBagLayoutPaginacionPoliticaProducto);						
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = 0;
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPoliticaProducto.add(this.jButtonAnterioresPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
					
						
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPoliticaProducto.gridy = 0;
			
			this.jPanelPaginacionPoliticaProducto.add(this.jButtonNuevoGuardarCambiosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
						
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPoliticaProducto.gridy = 0;
			this.jPanelPaginacionPoliticaProducto.add(this.jButtonSiguientesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = 1;
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaProducto.add(this.jButtonNuevoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
						
			
			
			if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
				this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPoliticaProducto.gridy = 1;
				this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPoliticaProducto.add(this.jButtonGuardarCambiosTablaPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			}
			
			
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = 1;
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaProducto.add(this.jButtonDuplicarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = 1;
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaProducto.add(this.jButtonCopiarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = 1;
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaProducto.add(this.jButtonVerFormPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = 1;
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPoliticaProducto.add(this.jButtonCerrarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
		
		
		this.jButtonRecargarInformacionPoliticaProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPoliticaProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPoliticaProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPoliticaProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPoliticaProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPoliticaProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPoliticaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPoliticaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPoliticaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPoliticaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPoliticaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPoliticaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPoliticaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPoliticaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPoliticaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPoliticaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPoliticaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPoliticaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPoliticaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPoliticaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPoliticaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPoliticaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPoliticaProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPoliticaProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPoliticaProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePoliticaProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePoliticaProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePoliticaProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPoliticaProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPoliticaProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPoliticaProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPoliticaProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPoliticaProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPoliticaProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPoliticaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPoliticaProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PoliticaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PoliticaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PoliticaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PoliticaProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPoliticaProducto.setLayout(gridaBagParametrosReportesPoliticaProducto);
			this.jPanelParametrosReportesAccionesPoliticaProducto.setLayout(gridaBagParametrosReportesAccionesPoliticaProducto);
			
			
			this.jPanelParametrosAuxiliar1PoliticaProducto.setLayout(gridaBagParametrosAuxiliar1PoliticaProducto);
			this.jPanelParametrosAuxiliar2PoliticaProducto.setLayout(gridaBagParametrosAuxiliar2PoliticaProducto);
			this.jPanelParametrosAuxiliar3PoliticaProducto.setLayout(gridaBagParametrosAuxiliar3PoliticaProducto);
			this.jPanelParametrosAuxiliar4PoliticaProducto.setLayout(gridaBagParametrosAuxiliar4PoliticaProducto);
			//this.jPanelParametrosAuxiliar5PoliticaProducto.setLayout(gridaBagParametrosAuxiliar2PoliticaProducto);			
			
			
			
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaProducto.add(this.jButtonRecargarInformacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaProducto.add(this.jComboBoxTiposPaginacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaProducto.add(this.jCheckBoxConAltoMaximoTablaPoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaProducto.add(this.jComboBoxTiposArchivosReportesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaProducto.add(this.jPanelParametrosAuxiliar1PoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PoliticaProducto.add(this.jComboBoxTiposReportesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaProducto.add(this.jPanelParametrosAuxiliar4PoliticaProducto, this.gridBagConstraintsPoliticaProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaProducto.add(this.jComboBoxTiposReportesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaProducto.add(this.jCheckBoxGenerarReportePoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaProducto.add(this.jPanelParametrosAuxiliar2PoliticaProducto, this.gridBagConstraintsPoliticaProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaProducto.add(this.jLabelAccionesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
				this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPoliticaProducto.add(this.jButtonAbrirOrderByPoliticaProducto, this.gridBagConstraintsPoliticaProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaProducto.add(this.jComboBoxTiposSeleccionarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
			
			
			/*
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaProducto.add(this.jCheckBoxSeleccionarTodosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticaProducto.add(this.jCheckBoxSeleccionarTodosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);															
				
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticaProducto.add(this.jCheckBoxSeleccionadosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaProducto.add(this.jPanelParametrosAuxiliar3PoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaProducto.add(this.jComboBoxTiposAccionesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
	
				
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaProducto.add(this.jTextFieldValorCampoGeneralPoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPoliticaProducto = new GridBagLayout();

			this.jScrollPanelDatosPoliticaProducto.setLayout(gridaBagLayoutDatosPoliticaProducto);
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = 0;
			this.gridBagConstraintsPoliticaProducto.gridx = 0;
			
			this.jScrollPanelDatosPoliticaProducto.add(this.jTableDatosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPoliticaProducto.setViewportView(this.jTableDatosPoliticaProducto);
		this.jTableDatosPoliticaProducto.setFillsViewportHeight(true);
		this.jTableDatosPoliticaProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPoliticaProducto= new GridBagLayout();
		this.jPanelAccionesPoliticaProducto.setLayout(gridaBagLayoutAccionesPoliticaProducto);
		
		
		/*	
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = 0;
		this.gridBagConstraintsPoliticaProducto.gridx = 0;
			
		this.jPanelAccionesPoliticaProducto.add(this.jButtonNuevoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaPoliticaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaPoliticaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaPoliticaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaPoliticaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaPoliticaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaPoliticaProducto.setLayout(gridaBagLayoutFK_IdBodegaPoliticaProducto);

		gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaProducto.gridy = 0;
		gridBagConstraintsPoliticaProducto.gridx = 0;
		jPanelFK_IdBodegaPoliticaProducto.add(jLabelid_bodegaFK_IdBodegaPoliticaProducto, gridBagConstraintsPoliticaProducto);

		gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaProducto.gridy = 0;
		gridBagConstraintsPoliticaProducto.gridx = 1;
		jPanelFK_IdBodegaPoliticaProducto.add(jComboBoxid_bodegaFK_IdBodegaPoliticaProducto, gridBagConstraintsPoliticaProducto);

		gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaProducto.gridy = 1;
		gridBagConstraintsPoliticaProducto.gridx =1;
		jPanelFK_IdBodegaPoliticaProducto.add(jButtonFK_IdBodegaPoliticaProducto, gridBagConstraintsPoliticaProducto);

		jTabbedPaneBusquedasPoliticaProducto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaPoliticaProducto);
		jTabbedPaneBusquedasPoliticaProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdProductoPoliticaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoPoliticaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoPoliticaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoPoliticaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoPoliticaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoPoliticaProducto.setLayout(gridaBagLayoutFK_IdProductoPoliticaProducto);

		gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaProducto.gridy = 0;
		gridBagConstraintsPoliticaProducto.gridx = 0;
		jPanelFK_IdProductoPoliticaProducto.add(jLabelid_productoFK_IdProductoPoliticaProducto, gridBagConstraintsPoliticaProducto);

		gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaProducto.gridy = 0;
		gridBagConstraintsPoliticaProducto.gridx = 1;
		jPanelFK_IdProductoPoliticaProducto.add(jComboBoxid_productoFK_IdProductoPoliticaProducto, gridBagConstraintsPoliticaProducto);


		gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsPoliticaProducto.gridy = 0;
		gridBagConstraintsPoliticaProducto.gridx = 0;
		jPanelFK_IdProductoPoliticaProducto.add(this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto, gridBagConstraintsPoliticaProducto);

		gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaProducto.gridy = 1;
		gridBagConstraintsPoliticaProducto.gridx =1;
		jPanelFK_IdProductoPoliticaProducto.add(jButtonFK_IdProductoPoliticaProducto, gridBagConstraintsPoliticaProducto);

		jTabbedPaneBusquedasPoliticaProducto.addTab("2.-Por Producto ", jPanelFK_IdProductoPoliticaProducto);
		jTabbedPaneBusquedasPoliticaProducto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPoliticaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPoliticaProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();						
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaProducto.gridx = 0;		
			//this.gridBagConstraintsPoliticaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPoliticaProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPoliticaProducto, this.gridBagConstraintsPoliticaProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPoliticaProducto.gridx = 0;		
		//this.gridBagConstraintsPoliticaProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPoliticaProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPoliticaProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaProducto.gridx = 0;		
			this.gridBagConstraintsPoliticaProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPoliticaProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPoliticaProducto, this.gridBagConstraintsPoliticaProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);								
		
		
		/*
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		*/		
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPoliticaProducto.gridx =0;
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPoliticaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
				
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPoliticaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPoliticaProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosPoliticaProducto.setLayout(gridaBagLayoutBusquedasParametrosPoliticaProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPoliticaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPoliticaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
			
			
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
			
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPoliticaProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPoliticaProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPoliticaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPoliticaProducto.setName("jPanelReporteDinamicoPoliticaProducto"); 
		
		this.jPanelReporteDinamicoPoliticaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPoliticaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPoliticaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPoliticaProducto.setLayout(gridaBagLayoutReporteDinamicoPoliticaProducto);
		
		
		this.jInternalFrameReporteDinamicoPoliticaProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPoliticaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePoliticaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPoliticaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPoliticaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPoliticaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPoliticaProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPoliticaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPoliticaProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoPoliticaProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoPoliticaProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPoliticaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPoliticaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPoliticaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePoliticaProducto = new JLabelMe();

		this.jLabelColumnasSelectReportePoliticaProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPoliticaProducto.add(this.jLabelColumnasSelectReportePoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePoliticaProducto = new JList<Reporte>();
		this.jListColumnasSelectReportePoliticaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePoliticaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePoliticaProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePoliticaProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePoliticaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePoliticaProducto=new JScrollPane(this.jListColumnasSelectReportePoliticaProducto);
			
			this.jScrollColumnasSelectReportePoliticaProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePoliticaProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePoliticaProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPoliticaProducto.add(this.jListColumnasSelectReportePoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		this.jPanelReporteDinamicoPoliticaProducto.add(this.jScrollColumnasSelectReportePoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePoliticaProducto = new JLabelMe();

		this.jLabelRelacionesSelectReportePoliticaProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePoliticaProducto = new JList<Reporte>();
		this.jListRelacionesSelectReportePoliticaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePoliticaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePoliticaProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePoliticaProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePoliticaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePoliticaProducto=new JScrollPane(this.jListRelacionesSelectReportePoliticaProducto);
			
			this.jScrollRelacionesSelectReportePoliticaProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePoliticaProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePoliticaProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPoliticaProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPoliticaProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoPoliticaProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPoliticaProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPoliticaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPoliticaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPoliticaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPoliticaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPoliticaProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPoliticaProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaProducto.add(this.jLabelGenerarExcelReporteDinamicoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPoliticaProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPoliticaProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPoliticaProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPoliticaProducto.setToolTipText("Generar EXCEL"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPoliticaProducto.add(this.jButtonGenerarExcelReporteDinamicoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaProducto.add(this.jComboBoxTiposReportesDinamicoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPoliticaProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPoliticaProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaProducto.add(this.jLabelTiposArchivoReporteDinamicoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaProducto.add(this.jComboBoxTiposArchivosReportesDinamicoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPoliticaProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPoliticaProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPoliticaProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPoliticaProducto.setToolTipText("Generar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaProducto.add(this.jButtonGenerarReporteDinamicoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPoliticaProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPoliticaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPoliticaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPoliticaProducto.setToolTipText("Cancelar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaProducto.add(this.jButtonCerrarReporteDinamicoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPoliticaProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPoliticaProducto= new JScrollPane(jPanelReporteDinamicoPoliticaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPoliticaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPoliticaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPoliticaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPoliticaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPoliticaProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPoliticaProducto);
		this.jInternalFrameReporteDinamicoPoliticaProducto.getContentPane().add(this.jScrollPanelReporteDinamicoPoliticaProducto, this.gridBagConstraintsPoliticaProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPoliticaProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPoliticaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPoliticaProducto.setName("jPanelImportacionPoliticaProducto"); 
		
		this.jPanelImportacionPoliticaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPoliticaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPoliticaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPoliticaProducto.setLayout(gridaBagLayoutImportacionPoliticaProducto);
		
		
		this.jInternalFrameImportacionPoliticaProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPoliticaProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPoliticaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePoliticaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPoliticaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPoliticaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPoliticaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPoliticaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPoliticaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPoliticaProducto.setResizable(true);
	    this.jInternalFrameImportacionPoliticaProducto.setClosable(true);
	    this.jInternalFrameImportacionPoliticaProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPoliticaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPoliticaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPoliticaProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPoliticaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPoliticaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPoliticaProducto.setResizable(true);
	    this.jInternalFrameImportacionPoliticaProducto.setClosable(true);
	    this.jInternalFrameImportacionPoliticaProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPoliticaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPoliticaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPoliticaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPoliticaProducto = new JLabelMe();

		this.jLabelArchivoImportacionPoliticaProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPoliticaProducto.add(this.jLabelArchivoImportacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPoliticaProducto = new JFileChooser();		
		this.jFileChooserImportacionPoliticaProducto.setToolTipText("ESCOGER ARCHIVO"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPoliticaProducto = new JButtonMe();
		this.jButtonAbrirImportacionPoliticaProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPoliticaProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPoliticaProducto.setToolTipText("Generar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaProducto.add(this.jButtonAbrirImportacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPoliticaProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionPoliticaProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPoliticaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPoliticaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPoliticaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPoliticaProducto.add(this.jLabelPathArchivoImportacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPoliticaProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPoliticaProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPoliticaProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPoliticaProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaProducto.add(this.jTextFieldPathArchivoImportacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPoliticaProducto = new JButtonMe();
		this.jButtonGenerarImportacionPoliticaProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPoliticaProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPoliticaProducto.setToolTipText("Generar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaProducto.add(this.jButtonGenerarImportacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPoliticaProducto = new JButtonMe();
		this.jButtonCerrarImportacionPoliticaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPoliticaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPoliticaProducto.setToolTipText("Cancelar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaProducto.add(this.jButtonCerrarImportacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPoliticaProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionPoliticaProducto= new JScrollPane(jPanelImportacionPoliticaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
		this.gridBagConstraintsPoliticaProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsPoliticaProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPoliticaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPoliticaProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPoliticaProducto);
		this.jInternalFrameImportacionPoliticaProducto.getContentPane().add(this.jScrollPanelImportacionPoliticaProducto, this.gridBagConstraintsPoliticaProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPoliticaProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPoliticaProducto = new JButtonMe();
			this.jButtonAbrirOrderByPoliticaProducto.setText("Orden");
			this.jButtonAbrirOrderByPoliticaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPoliticaProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPoliticaProducto";
			inputMap = this.jButtonAbrirOrderByPoliticaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPoliticaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPoliticaProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByPoliticaProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPoliticaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPoliticaProducto.setName("jPanelOrderByPoliticaProducto"); 
			
			this.jPanelOrderByPoliticaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPoliticaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPoliticaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPoliticaProducto.setLayout(gridaBagLayoutOrderByPoliticaProducto);
			
			
			this.jTableDatosPoliticaProductoOrderBy = new JTableMe();        
			this.jTableDatosPoliticaProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPoliticaProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPoliticaProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPoliticaProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPoliticaProductoOrderBy.setViewportView(this.jTableDatosPoliticaProductoOrderBy);
			this.jTableDatosPoliticaProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPoliticaProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPoliticaProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPoliticaProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPoliticaProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePoliticaProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPoliticaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPoliticaProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPoliticaProducto.setTitle("Orden");
			this.jInternalFrameOrderByPoliticaProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPoliticaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPoliticaProducto.setResizable(true);
			this.jInternalFrameOrderByPoliticaProducto.setClosable(true);
			this.jInternalFrameOrderByPoliticaProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPoliticaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPoliticaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPoliticaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPoliticaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPoliticaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPoliticaProducto.ipady =150;
				
			this.jPanelOrderByPoliticaProducto.add(jScrollPanelDatosPoliticaProductoOrderBy, this.gridBagConstraintsPoliticaProducto);//this.jTableDatosPoliticaProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPoliticaProducto = new JButtonMe();
			this.jButtonCerrarOrderByPoliticaProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPoliticaProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPoliticaProducto.setToolTipText("Cancelar"+" "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPoliticaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPoliticaProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPoliticaProducto.add(this.jButtonCerrarOrderByPoliticaProducto, this.gridBagConstraintsPoliticaProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPoliticaProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByPoliticaProducto= new JScrollPane(jPanelOrderByPoliticaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPoliticaProducto = new GridBagConstraints();
			this.gridBagConstraintsPoliticaProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsPoliticaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPoliticaProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPoliticaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPoliticaProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPoliticaProducto);
			
			this.jInternalFrameOrderByPoliticaProducto.getContentPane().add(this.jScrollPanelOrderByPoliticaProducto, this.gridBagConstraintsPoliticaProducto);			
		
		} else {
			this.jButtonAbrirOrderByPoliticaProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.politicaproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPoliticaProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPoliticaProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPoliticaProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPoliticaProducto.getRowHeight();//PoliticaProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PoliticaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPoliticaProducto.isSelected()) {
					iHeightTable=PoliticaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PoliticaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PoliticaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PoliticaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPoliticaProducto.isSelected()) {
					iHeightTable=PoliticaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PoliticaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PoliticaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPoliticaProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPoliticaProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPoliticaProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPoliticaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPoliticaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPoliticaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPoliticaProducto!=null && this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPoliticaProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPoliticaProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPoliticaProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPoliticaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPoliticaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPoliticaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=politicaproductoLogic.getPoliticaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicaproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PoliticaProducto> TraerPoliticaProductoBeans(List<PoliticaProducto> politicaproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PoliticaProducto politicaproducto:politicaproductos) {
					
				if(!(PoliticaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PoliticaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					politicaproducto.setsDetalleGeneralEntityReporte(PoliticaProductoConstantesFunciones.getPoliticaProductoDescripcion(politicaproducto));
										
						
					
						
					
				} else  {
							
					//politicaproducto.setsDetalleGeneralEntityReporte(politicaproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//politicaproductobeans.add(politicaproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return politicaproductos;
    }
	//PARA REPORTES FIN
}
