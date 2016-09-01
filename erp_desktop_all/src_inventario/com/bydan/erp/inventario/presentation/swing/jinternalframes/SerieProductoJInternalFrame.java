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
import com.bydan.erp.inventario.util.SerieProductoConstantesFunciones;

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
public class SerieProductoJInternalFrame extends SerieProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSerieProducto;
	
	protected JMenuBar jmenuBarSerieProducto;
	
	protected JMenu jmenuSerieProducto;
	protected JMenu jmenuDatosSerieProducto;
	protected JMenu jmenuArchivoSerieProducto;
	protected JMenu jmenuAccionesSerieProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSerieProducto;	
	protected GridBagConstraints gridBagConstraintsSerieProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SerieProductoDetalleFormJInternalFrame jInternalFrameDetalleFormSerieProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSerieProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSerieProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public SerieProductoSessionBean serieproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SerieProducto> serieproductos;		
	public List<SerieProducto> serieproductosEliminados;	
	public List<SerieProducto> serieproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySerieProducto;		
	protected JButton jButtonAbrirOrderBySerieProducto;
	
	
	//protected JPanel jPanelOrderBySerieProducto;
	//public JScrollPane jScrollPanelOrderBySerieProducto;	
	//protected JButton jButtonCerrarOrderBySerieProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SerieProductoLogic serieproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSerieProducto;
	public JScrollPane jScrollPanelDatosEdicionSerieProducto;
	public JScrollPane jScrollPanelDatosGeneralSerieProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosSerieProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSerieProducto;
	//public JScrollPane jScrollPanelImportacionSerieProducto;
	
	
	
	protected JPanel jPanelAccionesSerieProducto;
	
    protected JPanel jPanelPaginacionSerieProducto;
    protected JPanel jPanelParametrosReportesSerieProducto;
	protected JPanel jPanelParametrosReportesAccionesSerieProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SerieProducto;
	protected JPanel jPanelParametrosAuxiliar2SerieProducto;
	protected JPanel jPanelParametrosAuxiliar3SerieProducto;
	protected JPanel jPanelParametrosAuxiliar4SerieProducto;
	//protected JPanel jPanelParametrosAuxiliar5SerieProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoSerieProducto;
	//protected JPanel jPanelImportacionSerieProducto;
	
	
	public JTable jTableDatosSerieProducto;
	
	
	
	//public JTable jTableDatosSerieProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSerieProducto;
	protected JButton jButtonDuplicarSerieProducto;
	protected JButton jButtonCopiarSerieProducto;
	protected JButton jButtonVerFormSerieProducto;
	protected JButton jButtonNuevoRelacionesSerieProducto;
	protected JButton jButtonModificarSerieProducto;
	
    protected JButton jButtonGuardarCambiosTablaSerieProducto;
	protected JButton jButtonCerrarSerieProducto;
	
	
	protected JButton jButtonRecargarInformacionSerieProducto;
	protected JButton jButtonProcesarInformacionSerieProducto;
	
	
	protected JButton jButtonAnterioresSerieProducto;
	protected JButton jButtonSiguientesSerieProducto;
	protected JButton jButtonNuevoGuardarCambiosSerieProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSerieProducto;
	//protected JButton jButtonCerrarReporteDinamicoSerieProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoSerieProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionSerieProducto;
	//protected JButton jButtonGenerarImportacionSerieProducto;
	//protected JButton jButtonCerrarImportacionSerieProducto;
	//protected JFileChooser jFileChooserImportacionSerieProducto;
	//protected File fileImportacionSerieProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSerieProducto;
	protected JButton jButtonDuplicarToolBarSerieProducto;
	protected JButton jButtonNuevoRelacionesToolBarSerieProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarSerieProducto;
	protected JButton jButtonCopiarToolBarSerieProducto;
	protected JButton jButtonVerFormToolBarSerieProducto;
	public JButton jButtonGuardarCambiosTablaToolBarSerieProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarSerieProducto;
	protected JButton jButtonCerrarToolBarSerieProducto;
	
	protected JButton jButtonRecargarInformacionToolBarSerieProducto;
	protected JButton jButtonProcesarInformacionToolBarSerieProducto;
	protected JButton jButtonAnterioresToolBarSerieProducto;
	protected JButton jButtonSiguientesToolBarSerieProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarSerieProducto;
	protected JButton jButtonAbrirOrderByToolBarSerieProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSerieProducto;
	protected JMenuItem jMenuItemDuplicarSerieProducto;
	protected JMenuItem jMenuItemNuevoRelacionesSerieProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSerieProducto;
	protected JMenuItem jMenuItemCopiarSerieProducto;
	protected JMenuItem jMenuItemVerFormSerieProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaSerieProducto;
	protected JMenuItem jMenuItemCerrarSerieProducto;
	protected JMenuItem jMenuItemDetalleCerrarSerieProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySerieProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarSerieProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionSerieProducto;
	protected JMenuItem jMenuItemProcesarInformacionSerieProducto;
	protected JMenuItem jMenuItemAnterioresSerieProducto;
	protected JMenuItem jMenuItemSiguientesSerieProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSerieProducto;
	protected JMenuItem jMenuItemAbrirOrderBySerieProducto;
	protected JMenuItem jMenuItemMostrarOcultarSerieProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSerieProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSerieProducto;
	protected JCheckBox jCheckBoxSeleccionadosSerieProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSerieProducto;
	protected JCheckBox jCheckBoxConGraficoReporteSerieProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSerieProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSerieProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSerieProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSerieProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSerieProducto;
	protected JTextField jTextFieldValorCampoGeneralSerieProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSerieProducto;
	//public JList<Reporte> jListColumnasSelectReporteSerieProducto;
	//public JScrollPane jScrollColumnasSelectReporteSerieProducto;
	
	//public JLabel jLabelRelacionesSelectReporteSerieProducto;
	//public JList<Reporte> jListRelacionesSelectReporteSerieProducto;
	//public JScrollPane jScrollRelacionesSelectReporteSerieProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSerieProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSerieProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSerieProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoSerieProducto;
	
		
	//public JLabel jLabelArchivoImportacionSerieProducto;	
	//public JLabel jLabelPathArchivoImportacionSerieProducto;
	//protected JTextField jTextFieldPathArchivoImportacionSerieProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSerieProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSerieProducto;
	
	//public JLabel jLabelColumnaCategoriaValorSerieProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSerieProducto;
	
	//public JLabel jLabelColumnasValoresGraficoSerieProducto;
	//public JList<Reporte> jListColumnasValoresGraficoSerieProducto;
	//public JScrollPane jScrollColumnasValoresGraficoSerieProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSerieProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSerieProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSerieProducto;
	public JPanel jPanelBusquedaPorCodigoSerieProducto;
	public JButton jButtonBusquedaPorCodigoSerieProducto;
	public JPanel jPanelBusquedaPorFechaCompraSerieProducto;
	public JButton jButtonBusquedaPorFechaCompraSerieProducto;
	public JPanel jPanelBusquedaPorFechaEntregaSerieProducto;
	public JButton jButtonBusquedaPorFechaEntregaSerieProducto;
	public JPanel jPanelBusquedaPorFechaVentaSerieProducto;
	public JButton jButtonBusquedaPorFechaVentaSerieProducto;
	public JPanel jPanelFK_IdBodegaSerieProducto;
	public JButton jButtonFK_IdBodegaSerieProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoSerieProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoSerieProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoSerieProducto;
	public JButton jButtoncodigoBusquedaPorCodigoSerieProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_compraBusquedaPorFechaCompraSerieProducto;
	public JLabel jLabelfecha_compraBusquedaPorFechaCompraSerieProducto;
	//public JFormattedTextField jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto;

	public JDateChooser jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto;
	public JButton jButtonfecha_compraBusquedaPorFechaCompraSerieProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_entregaBusquedaPorFechaEntregaSerieProducto;
	public JLabel jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto;
	//public JFormattedTextField jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto;

	public JDateChooser jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto;
	public JButton jButtonfecha_entregaBusquedaPorFechaEntregaSerieProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_ventaBusquedaPorFechaVentaSerieProducto;
	public JLabel jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto;
	//public JFormattedTextField jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto;

	public JDateChooser jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto;
	public JButton jButtonfecha_ventaBusquedaPorFechaVentaSerieProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaFK_IdBodegaSerieProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaSerieProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaSerieProducto;
	public JButton jButtonid_bodegaFK_IdBodegaSerieProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaSerieProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaSerieProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public SerieProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SerieProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SerieProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SerieProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSerieProducto)	{
		this.jButtonRecargarInformacionSerieProducto = jButtonRecargarInformacionSerieProducto;
	}
	
	public JButton getjButtonProcesarInformacionSerieProducto() {
		return this.jButtonProcesarInformacionSerieProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSerieProducto)	{
		this.jButtonProcesarInformacionSerieProducto = jButtonProcesarInformacionSerieProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionSerieProducto() {
		return this.jButtonRecargarInformacionSerieProducto;
	}
	
	
	public List<SerieProducto> getserieproductos() {
		return this.serieproductos;
	}

	public void setserieproductos(List<SerieProducto> serieproductos) {
		this.serieproductos = serieproductos;
	}
	
	public List<SerieProducto> getserieproductosAux() {
		return this.serieproductosAux;
	}

	public void setserieproductosAux(List<SerieProducto> serieproductosAux) {
		this.serieproductosAux = serieproductosAux;
	}
	
	public List<SerieProducto> getserieproductosEliminados() {
		return this.serieproductosEliminados;
	}

	public void setSerieProductosEliminados(List<SerieProducto> serieproductosEliminados) {
		this.serieproductosEliminados = serieproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSerieProducto() {
		return jComboBoxTiposSeleccionarSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSerieProducto(
			JComboBox jComboBoxTiposSeleccionarSerieProducto) {
		this.jComboBoxTiposSeleccionarSerieProducto = jComboBoxTiposSeleccionarSerieProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSerieProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSerieProducto() {
		return jTextFieldValorCampoGeneralSerieProducto;
	}

	public void setjTextFieldValorCampoGeneralSerieProducto(
			JTextField jTextFieldValorCampoGeneralSerieProducto) {
		this.jTextFieldValorCampoGeneralSerieProducto = jTextFieldValorCampoGeneralSerieProducto;
	}

	public void setBorderResaltarValorCampoGeneralSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSerieProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSerieProducto() {
		return this.jCheckBoxSeleccionarTodosSerieProducto;
	}

	public void setjCheckBoxSeleccionarTodosSerieProducto(
			JCheckBox jCheckBoxSeleccionarTodosSerieProducto) {
		this.jCheckBoxSeleccionarTodosSerieProducto = jCheckBoxSeleccionarTodosSerieProducto;
	}

	public void setBorderResaltarSeleccionarTodosSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSerieProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSerieProducto() {
		return this.jCheckBoxSeleccionadosSerieProducto;
	}

	public void setjCheckBoxSeleccionadosSerieProducto(
			JCheckBox jCheckBoxSeleccionadosSerieProducto) {
		this.jCheckBoxSeleccionadosSerieProducto = jCheckBoxSeleccionadosSerieProducto;
	}
	
	public void setBorderResaltarSeleccionadosSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSerieProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSerieProducto() {
		return this.jComboBoxTiposArchivosReportesSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSerieProducto(
			JComboBox jComboBoxTiposArchivosReportesSerieProducto) {
		this.jComboBoxTiposArchivosReportesSerieProducto = jComboBoxTiposArchivosReportesSerieProducto;
	}

	public void setBorderResaltarTiposArchivosReportesSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSerieProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSerieProducto() {
		return this.jComboBoxTiposReportesSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSerieProducto(
			JComboBox jComboBoxTiposReportesSerieProducto) {
		this.jComboBoxTiposReportesSerieProducto = jComboBoxTiposReportesSerieProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSerieProducto() {
	//	return jComboBoxTiposReportesDinamicoSerieProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSerieProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoSerieProducto) {
	//	this.jComboBoxTiposReportesDinamicoSerieProducto = jComboBoxTiposReportesDinamicoSerieProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSerieProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoSerieProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSerieProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSerieProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSerieProducto = jComboBoxTiposArchivosReportesDinamicoSerieProducto;
	//}
	
	public void setBorderResaltarTiposReportesSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSerieProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSerieProducto() {
		return this.jComboBoxTiposGraficosReportesSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSerieProducto(
			JComboBox jComboBoxTiposGraficosReportesSerieProducto) {
		this.jComboBoxTiposGraficosReportesSerieProducto = jComboBoxTiposGraficosReportesSerieProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSerieProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSerieProducto() {
		return this.jComboBoxTiposPaginacionSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSerieProducto(
			JComboBox jComboBoxTiposPaginacionSerieProducto) {
		this.jComboBoxTiposPaginacionSerieProducto = jComboBoxTiposPaginacionSerieProducto;
	}
	
	public void setBorderResaltarTiposPaginacionSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSerieProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSerieProducto() {
		return this.jComboBoxTiposRelacionesSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSerieProducto() {
		return this.jComboBoxTiposAccionesSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSerieProducto(
			JComboBox jComboBoxTiposRelacionesSerieProducto) {
		this.jComboBoxTiposRelacionesSerieProducto = jComboBoxTiposRelacionesSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSerieProducto(
			JComboBox jComboBoxTiposAccionesSerieProducto) {
		this.jComboBoxTiposAccionesSerieProducto = jComboBoxTiposAccionesSerieProducto;
	}
	
	public void setBorderResaltarTiposRelacionesSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSerieProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSerieProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSerieProducto() {
	//	return jCheckBoxConGraficoDinamicoSerieProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoSerieProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoSerieProducto) {
	//	this.jCheckBoxConGraficoDinamicoSerieProducto = jCheckBoxConGraficoDinamicoSerieProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSerieProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSerieProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSerieProducto .setBorder(borderResaltar);		
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
		this.serieproductoSessionBean=new SerieProductoSessionBean();
		
		this.serieproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.serieproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.serieproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SerieProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Serie Producto MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		SerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSerieProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"nuevo","nuevo","Nuevo"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"duplicar","duplicar","Duplicar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"copiar","copiar","Copiar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"ver_form","ver_form","Ver"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"recargar","recargar","Recargar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSerieProducto,this.jTtoolBarSerieProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSerieProducto,this.jTtoolBarSerieProducto,
							"cerrar","cerrar","Salir"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSerieProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSerieProducto;
			
				this.jButtonProcesarInformacionToolBarSerieProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSerieProducto;
				
		//protected JButton jButtonModificarToolBarSerieProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSerieProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSerieProducto=new JMenuMe("General");
		this.jmenuArchivoSerieProducto=new JMenuMe("Archivo");
		this.jmenuAccionesSerieProducto=new JMenuMe("Acciones");
		this.jmenuDatosSerieProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSerieProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSerieProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSerieProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSerieProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSerieProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSerieProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSerieProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSerieProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSerieProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSerieProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSerieProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSerieProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSerieProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSerieProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSerieProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSerieProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSerieProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSerieProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSerieProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSerieProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSerieProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSerieProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSerieProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSerieProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSerieProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSerieProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSerieProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSerieProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSerieProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSerieProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSerieProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSerieProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSerieProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSerieProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSerieProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSerieProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySerieProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySerieProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySerieProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSerieProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSerieProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSerieProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySerieProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySerieProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySerieProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSerieProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSerieProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSerieProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSerieProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSerieProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSerieProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSerieProducto.add(this.jMenuItemCerrarSerieProducto);
			
			this.jmenuAccionesSerieProducto.add(this.jMenuItemNuevoSerieProducto);
			this.jmenuAccionesSerieProducto.add(this.jMenuItemNuevoGuardarCambiosSerieProducto);
			this.jmenuAccionesSerieProducto.add(this.jMenuItemNuevoRelacionesSerieProducto);
			this.jmenuAccionesSerieProducto.add(this.jMenuItemGuardarCambiosTablaSerieProducto);		
			this.jmenuAccionesSerieProducto.add(this.jMenuItemDuplicarSerieProducto);		
			this.jmenuAccionesSerieProducto.add(this.jMenuItemCopiarSerieProducto);		
			this.jmenuAccionesSerieProducto.add(this.jMenuItemVerFormSerieProducto);		
			
			this.jmenuDatosSerieProducto.add(this.jMenuItemRecargarInformacionSerieProducto);				
			this.jmenuDatosSerieProducto.add(this.jMenuItemAnterioresSerieProducto);				
			this.jmenuDatosSerieProducto.add(this.jMenuItemSiguientesSerieProducto);				
			this.jmenuDatosSerieProducto.add(this.jMenuItemAbrirOrderBySerieProducto);				
			this.jmenuDatosSerieProducto.add(this.jMenuItemMostrarOcultarSerieProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSerieProducto.add(this.jMenuItemGuardarCambiosSerieProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSerieProducto.add(this.jmenuArchivoSerieProducto);		
			this.jmenuBarSerieProducto.add(this.jmenuAccionesSerieProducto);		
			this.jmenuBarSerieProducto.add(this.jmenuDatosSerieProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSerieProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSerieProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoSerieProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoSerieProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoSerieProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoSerieProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoSerieProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoSerieProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoSerieProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoSerieProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoSerieProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldcodigoBusquedaPorCodigoSerieProducto.setText("0.0");



		this.jPanelBusquedaPorFechaCompraSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaCompraSerieProducto.setToolTipText("Buscar Por Fecha Compra ");
		this.jButtonBusquedaPorFechaCompraSerieProducto= new JButtonMe();
		this.jButtonBusquedaPorFechaCompraSerieProducto.setText("Buscar");
		this.jButtonBusquedaPorFechaCompraSerieProducto.setToolTipText("Buscar Por Fecha Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaCompraSerieProducto,"buscar_button","Buscar Por Fecha Compra ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaCompraSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_compraBusquedaPorFechaCompraSerieProducto = new JLabelMe();
		jLabelfecha_compraBusquedaPorFechaCompraSerieProducto.setText("Fecha Compra :");
		jLabelfecha_compraBusquedaPorFechaCompraSerieProducto.setToolTipText("Fecha Compra");
		jLabelfecha_compraBusquedaPorFechaCompraSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_compraBusquedaPorFechaCompraSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_compraBusquedaPorFechaCompraSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraBusquedaPorFechaCompraSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto= new JDateChooser();
		jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto.setDate(new Date());
		jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorFechaEntregaSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaEntregaSerieProducto.setToolTipText("Buscar Por Fecha Entrega ");
		this.jButtonBusquedaPorFechaEntregaSerieProducto= new JButtonMe();
		this.jButtonBusquedaPorFechaEntregaSerieProducto.setText("Buscar");
		this.jButtonBusquedaPorFechaEntregaSerieProducto.setToolTipText("Buscar Por Fecha Entrega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaEntregaSerieProducto,"buscar_button","Buscar Por Fecha Entrega ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaEntregaSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto = new JLabelMe();
		jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto.setText("Fecha Entrega :");
		jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto.setToolTipText("Fecha Entrega");
		jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto= new JDateChooser();
		jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto.setDate(new Date());
		jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorFechaVentaSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaVentaSerieProducto.setToolTipText("Buscar Por Fecha Venta ");
		this.jButtonBusquedaPorFechaVentaSerieProducto= new JButtonMe();
		this.jButtonBusquedaPorFechaVentaSerieProducto.setText("Buscar");
		this.jButtonBusquedaPorFechaVentaSerieProducto.setToolTipText("Buscar Por Fecha Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaVentaSerieProducto,"buscar_button","Buscar Por Fecha Venta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaVentaSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto = new JLabelMe();
		jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto.setText("Fecha Venta :");
		jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto.setToolTipText("Fecha Venta");
		jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto= new JDateChooser();
		jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto.setDate(new Date());
		jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelFK_IdBodegaSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaSerieProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaSerieProducto= new JButtonMe();
		this.jButtonFK_IdBodegaSerieProducto.setText("Buscar");
		this.jButtonFK_IdBodegaSerieProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaSerieProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaSerieProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaSerieProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaSerieProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaSerieProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSerieProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasSerieProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSerieProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSerieProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSerieProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSerieProducto = new SerieProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Serie Producto DATOS");
			this.jInternalFrameDetalleFormSerieProducto = new SerieProductoDetalleFormJInternalFrame(jDesktopPane,this.serieproductoSessionBean.getConGuardarRelaciones(),this.serieproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSerieProducto = null;//new SerieProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSerieProducto= new GridBagLayout();
		
		
		this.jTableDatosSerieProducto = new JTableMe();      
		
		String sToolTipSerieProducto="";
		sToolTipSerieProducto=SerieProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSerieProducto+="(Inventario.SerieProducto)";
		}
		
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSerieProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSerieProducto.setToolTipText(sToolTipSerieProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSerieProducto);
		this.jTableDatosSerieProducto.setAutoCreateRowSorter(true);
		this.jTableDatosSerieProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSerieProducto.setRowSelectionAllowed(true);
		this.jTableDatosSerieProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSerieProducto = new JButtonMe();
		this.jButtonDuplicarSerieProducto = new JButtonMe();
		this.jButtonCopiarSerieProducto = new JButtonMe();
		this.jButtonVerFormSerieProducto = new JButtonMe();
		this.jButtonNuevoRelacionesSerieProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSerieProducto = new JButtonMe();
		this.jButtonCerrarSerieProducto = new JButtonMe();
		
		this.jScrollPanelDatosSerieProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralSerieProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Serie Producto";
		
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Serie Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosSerieProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSerieProducto.setToolTipText("Acciones");
        this.jPanelAccionesSerieProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSerieProducto=new ReporteDinamicoJInternalFrame(SerieProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSerieProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSerieProducto=new ImportacionJInternalFrame(SerieProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSerieProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySerieProducto = new JButtonMe();
		
		this.jButtonAbrirOrderBySerieProducto.setText("Orden");
		this.jButtonAbrirOrderBySerieProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySerieProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySerieProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySerieProducto,false,this);
			
			//this.cargarOrderBySerieProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySerieProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySerieProducto,true,this);
			
			//this.cargarOrderBySerieProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSerieProducto.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosSerieProducto.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosSerieProducto.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosSerieProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSerieProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSerieProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSerieProducto.setText("Nuevo");
		this.jButtonDuplicarSerieProducto.setText("Duplicar");
		this.jButtonCopiarSerieProducto.setText("Copiar");
		this.jButtonVerFormSerieProducto.setText("Ver");
		this.jButtonNuevoRelacionesSerieProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSerieProducto.setText("Guardar");
		this.jButtonCerrarSerieProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSerieProducto,"nuevo_button","Nuevo",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSerieProducto,"duplicar_button","Duplicar",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSerieProducto,"copiar_button","Copiar",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSerieProducto,"ver_form","Ver",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSerieProducto,"nuevorelaciones_button","Nuevo Rel",this.serieproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSerieProducto,"guardarcambiostabla_button","Guardar",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSerieProducto,"cerrar_button","Salir",this.serieproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSerieProducto.setToolTipText("Nuevo"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSerieProducto.setToolTipText("Duplicar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSerieProducto.setToolTipText("Copiar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSerieProducto.setToolTipText("Ver"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSerieProducto.setToolTipText("Nuevo Rel"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSerieProducto.setToolTipText("Guardar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSerieProducto.setToolTipText("Salir"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSerieProducto";
		inputMap = this.jButtonNuevoSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSerieProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarSerieProducto";
		inputMap = this.jButtonDuplicarSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSerieProducto"));
		
		//COPIAR
		sMapKey = "CopiarSerieProducto";
		inputMap = this.jButtonCopiarSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSerieProducto"));
		
		//VEr FORM
		sMapKey = "VerFormSerieProducto";
		inputMap = this.jButtonVerFormSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSerieProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSerieProducto";
		inputMap = this.jButtonNuevoRelacionesSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSerieProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSerieProducto";
		inputMap = this.jButtonModificarSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSerieProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSerieProducto";
		inputMap = this.jButtonCerrarSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSerieProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSerieProducto";
		inputMap = this.jButtonGuardarCambiosTablaSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSerieProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSerieProducto.setName("jPanelParametrosReportesSerieProducto"); 
		
		this.jPanelParametrosReportesAccionesSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSerieProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSerieProducto.setName("jPanelParametrosReportesAccionesSerieProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSerieProducto = new JButtonMe();
		this.jButtonRecargarInformacionSerieProducto.setText("Recargar");
		this.jButtonRecargarInformacionSerieProducto.setToolTipText("Recargar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSerieProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSerieProducto = new JButtonMe();
		this.jButtonProcesarInformacionSerieProducto.setText("Procesar");
		this.jButtonProcesarInformacionSerieProducto.setToolTipText("Procesar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSerieProducto.setVisible(false);
			
		this.jButtonProcesarInformacionSerieProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSerieProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSerieProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSerieProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSerieProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSerieProducto.setText("TIPO");       
		this.jComboBoxTiposReportesSerieProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSerieProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSerieProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSerieProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionSerieProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSerieProducto.setText("Accion");
		this.jComboBoxTiposRelacionesSerieProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSerieProducto.setText("Accion");
		this.jComboBoxTiposAccionesSerieProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSerieProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarSerieProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSerieProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSerieProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSerieProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSerieProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSerieProducto = new JLabelMe();
		
		this.jLabelAccionesSerieProducto.setText("Acciones");		
		this.jLabelAccionesSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSerieProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSerieProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSerieProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSerieProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSerieProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSerieProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSerieProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSerieProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSerieProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSerieProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSerieProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteSerieProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSerieProducto = new JButtonMe();
		//this.jButtonAnterioresSerieProducto.setText("<<");
        this.jButtonAnterioresSerieProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSerieProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSerieProducto = new JButtonMe();
		//this.jButtonSiguientesSerieProducto.setText(">>");
        this.jButtonSiguientesSerieProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSerieProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSerieProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSerieProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosSerieProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSerieProducto,"nuevoguardarcambios_button","Nue",this.serieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSerieProducto";
		inputMap = this.jButtonNuevoGuardarCambiosSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSerieProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSerieProducto";
		inputMap = this.jButtonRecargarInformacionSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSerieProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSerieProducto";
		inputMap = this.jButtonSiguientesSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSerieProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSerieProducto";
		inputMap = this.jButtonAnterioresSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSerieProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSerieProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSerieProducto.setMinimumSize(new Dimension(this.getWidth(),SerieProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SerieProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSerieProducto.setMaximumSize(new Dimension(this.getWidth(),SerieProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SerieProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSerieProducto.setPreferredSize(new Dimension(this.getWidth(),SerieProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SerieProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSerieProducto = new GridBagLayout();

			this.jPanelPaginacionSerieProducto.setLayout(gridaBagLayoutPaginacionSerieProducto);						
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = 0;
			this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSerieProducto.add(this.jButtonAnterioresSerieProducto, this.gridBagConstraintsSerieProducto);
					
						
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSerieProducto.gridy = 0;
			
			this.jPanelPaginacionSerieProducto.add(this.jButtonNuevoGuardarCambiosSerieProducto, this.gridBagConstraintsSerieProducto);
						
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSerieProducto.gridy = 0;
			this.jPanelPaginacionSerieProducto.add(this.jButtonSiguientesSerieProducto, this.gridBagConstraintsSerieProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = 1;
			this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSerieProducto.add(this.jButtonNuevoSerieProducto, this.gridBagConstraintsSerieProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsSerieProducto = new GridBagConstraints();
				this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSerieProducto.gridy = 1;
				this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionSerieProducto.add(this.jButtonNuevoRelacionesSerieProducto, this.gridBagConstraintsSerieProducto);
			}
			
			
			if(!this.serieproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSerieProducto = new GridBagConstraints();
				this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSerieProducto.gridy = 1;
				this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSerieProducto.add(this.jButtonGuardarCambiosTablaSerieProducto, this.gridBagConstraintsSerieProducto);
			}
			
			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = 1;
			this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSerieProducto.add(this.jButtonDuplicarSerieProducto, this.gridBagConstraintsSerieProducto);
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = 1;
			this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSerieProducto.add(this.jButtonCopiarSerieProducto, this.gridBagConstraintsSerieProducto);
		
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = 1;
			this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSerieProducto.add(this.jButtonVerFormSerieProducto, this.gridBagConstraintsSerieProducto);
		
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = 1;
			this.gridBagConstraintsSerieProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSerieProducto.add(this.jButtonCerrarSerieProducto, this.gridBagConstraintsSerieProducto);
		
		
		
		this.jButtonRecargarInformacionSerieProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSerieProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSerieProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSerieProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSerieProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSerieProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSerieProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSerieProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSerieProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSerieProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSerieProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSerieProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSerieProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSerieProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSerieProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSerieProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSerieProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSerieProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSerieProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSerieProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSerieProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSerieProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSerieProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSerieProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSerieProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSerieProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSerieProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSerieProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSerieProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSerieProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSerieProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSerieProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSerieProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSerieProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSerieProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSerieProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSerieProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSerieProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SerieProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SerieProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SerieProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SerieProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSerieProducto.setLayout(gridaBagParametrosReportesSerieProducto);
			this.jPanelParametrosReportesAccionesSerieProducto.setLayout(gridaBagParametrosReportesAccionesSerieProducto);
			
			
			this.jPanelParametrosAuxiliar1SerieProducto.setLayout(gridaBagParametrosAuxiliar1SerieProducto);
			this.jPanelParametrosAuxiliar2SerieProducto.setLayout(gridaBagParametrosAuxiliar2SerieProducto);
			this.jPanelParametrosAuxiliar3SerieProducto.setLayout(gridaBagParametrosAuxiliar3SerieProducto);
			this.jPanelParametrosAuxiliar4SerieProducto.setLayout(gridaBagParametrosAuxiliar4SerieProducto);
			//this.jPanelParametrosAuxiliar5SerieProducto.setLayout(gridaBagParametrosAuxiliar2SerieProducto);			
			
			
			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSerieProducto.add(this.jButtonRecargarInformacionSerieProducto, this.gridBagConstraintsSerieProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SerieProducto.add(this.jComboBoxTiposPaginacionSerieProducto, this.gridBagConstraintsSerieProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SerieProducto.add(this.jCheckBoxConAltoMaximoTablaSerieProducto, this.gridBagConstraintsSerieProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SerieProducto.add(this.jComboBoxTiposArchivosReportesSerieProducto, this.gridBagConstraintsSerieProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSerieProducto.add(this.jPanelParametrosAuxiliar1SerieProducto, this.gridBagConstraintsSerieProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SerieProducto.add(this.jComboBoxTiposReportesSerieProducto, this.gridBagConstraintsSerieProducto);																		
			
			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SerieProducto.add(this.jComboBoxTiposGraficosReportesSerieProducto, this.gridBagConstraintsSerieProducto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSerieProducto.add(this.jPanelParametrosAuxiliar4SerieProducto, this.gridBagConstraintsSerieProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSerieProducto.add(this.jComboBoxTiposReportesSerieProducto, this.gridBagConstraintsSerieProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSerieProducto.add(this.jCheckBoxGenerarReporteSerieProducto, this.gridBagConstraintsSerieProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSerieProducto.add(this.jPanelParametrosAuxiliar2SerieProducto, this.gridBagConstraintsSerieProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSerieProducto.add(this.jLabelAccionesSerieProducto, this.gridBagConstraintsSerieProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSerieProducto = new GridBagConstraints();
				this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSerieProducto.add(this.jButtonAbrirOrderBySerieProducto, this.gridBagConstraintsSerieProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSerieProducto.add(this.jComboBoxTiposSeleccionarSerieProducto, this.gridBagConstraintsSerieProducto);			
			
			
			/*
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSerieProducto.add(this.jCheckBoxSeleccionarTodosSerieProducto, this.gridBagConstraintsSerieProducto);
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSerieProducto.add(this.jCheckBoxConGraficoReporteSerieProducto, this.gridBagConstraintsSerieProducto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SerieProducto.add(this.jCheckBoxSeleccionarTodosSerieProducto, this.gridBagConstraintsSerieProducto);															
				
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SerieProducto.add(this.jCheckBoxSeleccionadosSerieProducto, this.gridBagConstraintsSerieProducto);															
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSerieProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SerieProducto.add(this.jCheckBoxConGraficoReporteSerieProducto, this.gridBagConstraintsSerieProducto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSerieProducto.add(this.jPanelParametrosAuxiliar3SerieProducto, this.gridBagConstraintsSerieProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSerieProducto.add(this.jComboBoxTiposRelacionesSerieProducto, this.gridBagConstraintsSerieProducto);
				
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSerieProducto.add(this.jComboBoxTiposAccionesSerieProducto, this.gridBagConstraintsSerieProducto);
	
				
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSerieProducto.add(this.jTextFieldValorCampoGeneralSerieProducto, this.gridBagConstraintsSerieProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSerieProducto = new GridBagLayout();

			this.jScrollPanelDatosSerieProducto.setLayout(gridaBagLayoutDatosSerieProducto);
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = 0;
			this.gridBagConstraintsSerieProducto.gridx = 0;
			
			this.jScrollPanelDatosSerieProducto.add(this.jTableDatosSerieProducto, this.gridBagConstraintsSerieProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSerieProducto.setViewportView(this.jTableDatosSerieProducto);
		this.jTableDatosSerieProducto.setFillsViewportHeight(true);
		this.jTableDatosSerieProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSerieProducto= new GridBagLayout();
		this.jPanelAccionesSerieProducto.setLayout(gridaBagLayoutAccionesSerieProducto);
		
		
		/*	
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = 0;
		this.gridBagConstraintsSerieProducto.gridx = 0;
			
		this.jPanelAccionesSerieProducto.add(this.jButtonNuevoSerieProducto, this.gridBagConstraintsSerieProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoSerieProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoSerieProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSerieProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSerieProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoSerieProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoSerieProducto.setLayout(gridaBagLayoutBusquedaPorCodigoSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 0;
		jPanelBusquedaPorCodigoSerieProducto.add(jLabelcodigoBusquedaPorCodigoSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 1;
		jPanelBusquedaPorCodigoSerieProducto.add(jTextFieldcodigoBusquedaPorCodigoSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 1;
		gridBagConstraintsSerieProducto.gridx =1;
		jPanelBusquedaPorCodigoSerieProducto.add(jButtonBusquedaPorCodigoSerieProducto, gridBagConstraintsSerieProducto);

		jTabbedPaneBusquedasSerieProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoSerieProducto);
		jTabbedPaneBusquedasSerieProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorFechaCompraSerieProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaCompraSerieProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaCompraSerieProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaCompraSerieProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaCompraSerieProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaCompraSerieProducto.setLayout(gridaBagLayoutBusquedaPorFechaCompraSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 0;
		jPanelBusquedaPorFechaCompraSerieProducto.add(jLabelfecha_compraBusquedaPorFechaCompraSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 1;
		jPanelBusquedaPorFechaCompraSerieProducto.add(jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 1;
		gridBagConstraintsSerieProducto.gridx =1;
		jPanelBusquedaPorFechaCompraSerieProducto.add(jButtonBusquedaPorFechaCompraSerieProducto, gridBagConstraintsSerieProducto);

		jTabbedPaneBusquedasSerieProducto.addTab("2.-Por Fecha Compra ", jPanelBusquedaPorFechaCompraSerieProducto);
		jTabbedPaneBusquedasSerieProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorFechaEntregaSerieProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaEntregaSerieProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaEntregaSerieProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaEntregaSerieProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaEntregaSerieProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaEntregaSerieProducto.setLayout(gridaBagLayoutBusquedaPorFechaEntregaSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 0;
		jPanelBusquedaPorFechaEntregaSerieProducto.add(jLabelfecha_entregaBusquedaPorFechaEntregaSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 1;
		jPanelBusquedaPorFechaEntregaSerieProducto.add(jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 1;
		gridBagConstraintsSerieProducto.gridx =1;
		jPanelBusquedaPorFechaEntregaSerieProducto.add(jButtonBusquedaPorFechaEntregaSerieProducto, gridBagConstraintsSerieProducto);

		jTabbedPaneBusquedasSerieProducto.addTab("3.-Por Fecha Entrega ", jPanelBusquedaPorFechaEntregaSerieProducto);
		jTabbedPaneBusquedasSerieProducto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorFechaVentaSerieProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaVentaSerieProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaVentaSerieProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaVentaSerieProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaVentaSerieProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaVentaSerieProducto.setLayout(gridaBagLayoutBusquedaPorFechaVentaSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 0;
		jPanelBusquedaPorFechaVentaSerieProducto.add(jLabelfecha_ventaBusquedaPorFechaVentaSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 1;
		jPanelBusquedaPorFechaVentaSerieProducto.add(jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 1;
		gridBagConstraintsSerieProducto.gridx =1;
		jPanelBusquedaPorFechaVentaSerieProducto.add(jButtonBusquedaPorFechaVentaSerieProducto, gridBagConstraintsSerieProducto);

		jTabbedPaneBusquedasSerieProducto.addTab("4.-Por Fecha Venta ", jPanelBusquedaPorFechaVentaSerieProducto);
		jTabbedPaneBusquedasSerieProducto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdBodegaSerieProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaSerieProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaSerieProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaSerieProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaSerieProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaSerieProducto.setLayout(gridaBagLayoutFK_IdBodegaSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 0;
		jPanelFK_IdBodegaSerieProducto.add(jLabelid_bodegaFK_IdBodegaSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 0;
		gridBagConstraintsSerieProducto.gridx = 1;
		jPanelFK_IdBodegaSerieProducto.add(jComboBoxid_bodegaFK_IdBodegaSerieProducto, gridBagConstraintsSerieProducto);

		gridBagConstraintsSerieProducto = new GridBagConstraints();
		gridBagConstraintsSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSerieProducto.gridy = 1;
		gridBagConstraintsSerieProducto.gridx =1;
		jPanelFK_IdBodegaSerieProducto.add(jButtonFK_IdBodegaSerieProducto, gridBagConstraintsSerieProducto);

		jTabbedPaneBusquedasSerieProducto.addTab("5.-Por Bodega ", jPanelFK_IdBodegaSerieProducto);
		jTabbedPaneBusquedasSerieProducto.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSerieProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSerieProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();						
			this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSerieProducto.gridx = 0;		
			//this.gridBagConstraintsSerieProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSerieProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSerieProducto, this.gridBagConstraintsSerieProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSerieProducto.gridx = 0;		
		//this.gridBagConstraintsSerieProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSerieProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSerieProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSerieProducto.gridx = 0;		
			this.gridBagConstraintsSerieProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSerieProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSerieProducto, this.gridBagConstraintsSerieProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSerieProducto, this.gridBagConstraintsSerieProducto);								
		
		
		/*
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSerieProducto, this.gridBagConstraintsSerieProducto);
		*/		
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSerieProducto.gridx =0;
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSerieProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSerieProducto, this.gridBagConstraintsSerieProducto);
				
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSerieProducto, this.gridBagConstraintsSerieProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(SerieProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSerieProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosSerieProducto.setLayout(gridaBagLayoutBusquedasParametrosSerieProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSerieProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSerieProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSerieProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSerieProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSerieProducto, this.gridBagConstraintsSerieProducto);
			
			
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSerieProducto, this.gridBagConstraintsSerieProducto);
		
			
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSerieProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSerieProducto, this.gridBagConstraintsSerieProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSerieProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSerieProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSerieProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSerieProducto.setName("jPanelReporteDinamicoSerieProducto"); 
		
		this.jPanelReporteDinamicoSerieProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSerieProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSerieProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSerieProducto.setLayout(gridaBagLayoutReporteDinamicoSerieProducto);
		
		
		this.jInternalFrameReporteDinamicoSerieProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSerieProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSerieProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSerieProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSerieProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSerieProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSerieProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSerieProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSerieProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoSerieProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoSerieProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSerieProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSerieProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSerieProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Serie Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSerieProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteSerieProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelColumnasSelectReporteSerieProducto, this.gridBagConstraintsSerieProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSerieProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteSerieProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSerieProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSerieProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSerieProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSerieProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSerieProducto=new JScrollPane(this.jListColumnasSelectReporteSerieProducto);
			
			this.jScrollColumnasSelectReporteSerieProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSerieProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSerieProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSerieProducto.add(this.jListColumnasSelectReporteSerieProducto, this.gridBagConstraintsSerieProducto);
		this.jPanelReporteDinamicoSerieProducto.add(this.jScrollColumnasSelectReporteSerieProducto, this.gridBagConstraintsSerieProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSerieProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteSerieProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelRelacionesSelectReporteSerieProducto, this.gridBagConstraintsSerieProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSerieProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteSerieProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSerieProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSerieProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSerieProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSerieProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSerieProducto=new JScrollPane(this.jListRelacionesSelectReporteSerieProducto);
			
			this.jScrollRelacionesSelectReporteSerieProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSerieProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSerieProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSerieProducto.add(this.jListRelacionesSelectReporteSerieProducto, this.gridBagConstraintsSerieProducto);
		this.jPanelReporteDinamicoSerieProducto.add(this.jScrollRelacionesSelectReporteSerieProducto, this.gridBagConstraintsSerieProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoSerieProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSerieProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoSerieProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSerieProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSerieProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSerieProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSerieProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSerieProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSerieProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSerieProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSerieProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSerieProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSerieProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSerieProducto = new JLabelMe();

		this.jLabelConGraficoDinamicoSerieProducto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelConGraficoDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSerieProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSerieProducto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSerieProducto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSerieProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSerieProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSerieProducto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSerieProducto.add(this.jCheckBoxConGraficoDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSerieProducto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSerieProducto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelColumnaCategoriaGraficoSerieProducto, this.gridBagConstraintsSerieProducto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSerieProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSerieProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSerieProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSerieProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSerieProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSerieProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSerieProducto.add(this.jComboBoxColumnaCategoriaGraficoSerieProducto, this.gridBagConstraintsSerieProducto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSerieProducto = new JLabelMe();

		this.jLabelColumnaCategoriaValorSerieProducto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelColumnaCategoriaValorSerieProducto, this.gridBagConstraintsSerieProducto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSerieProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSerieProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSerieProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSerieProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSerieProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSerieProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSerieProducto.add(this.jComboBoxColumnaCategoriaValorSerieProducto, this.gridBagConstraintsSerieProducto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSerieProducto = new JLabelMe();

		this.jLabelColumnasValoresGraficoSerieProducto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelColumnasValoresGraficoSerieProducto, this.gridBagConstraintsSerieProducto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSerieProducto = new JList<Reporte>();
		this.jListColumnasValoresGraficoSerieProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSerieProducto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSerieProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSerieProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSerieProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSerieProducto=new JScrollPane(this.jListColumnasValoresGraficoSerieProducto);
			
			this.jScrollColumnasValoresGraficoSerieProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSerieProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSerieProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSerieProducto.add(this.jListColumnasSelectReporteSerieProducto, this.gridBagConstraintsSerieProducto);
		this.jPanelReporteDinamicoSerieProducto.add(this.jScrollColumnasValoresGraficoSerieProducto, this.gridBagConstraintsSerieProducto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSerieProducto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSerieProducto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelTiposGraficosReportesDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSerieProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSerieProducto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSerieProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSerieProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSerieProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSerieProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSerieProducto.add(this.jComboBoxTiposGraficosReportesDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSerieProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSerieProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelGenerarExcelReporteDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSerieProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSerieProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSerieProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSerieProducto.setToolTipText("Generar EXCEL"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSerieProducto.add(this.jButtonGenerarExcelReporteDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSerieProducto.add(this.jComboBoxTiposReportesDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSerieProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSerieProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSerieProducto.add(this.jLabelTiposArchivoReporteDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSerieProducto.add(this.jComboBoxTiposArchivosReportesDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSerieProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSerieProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSerieProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSerieProducto.setToolTipText("Generar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSerieProducto.add(this.jButtonGenerarReporteDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSerieProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSerieProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSerieProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSerieProducto.setToolTipText("Cancelar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSerieProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSerieProducto.add(this.jButtonCerrarReporteDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSerieProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSerieProducto= new JScrollPane(jPanelReporteDinamicoSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSerieProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSerieProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSerieProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Serie Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSerieProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSerieProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSerieProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSerieProducto);
		this.jInternalFrameReporteDinamicoSerieProducto.getContentPane().add(this.jScrollPanelReporteDinamicoSerieProducto, this.gridBagConstraintsSerieProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSerieProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSerieProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSerieProducto.setName("jPanelImportacionSerieProducto"); 
		
		this.jPanelImportacionSerieProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSerieProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSerieProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSerieProducto.setLayout(gridaBagLayoutImportacionSerieProducto);
		
		
		this.jInternalFrameImportacionSerieProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSerieProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSerieProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSerieProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSerieProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSerieProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSerieProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSerieProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSerieProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSerieProducto.setResizable(true);
	    this.jInternalFrameImportacionSerieProducto.setClosable(true);
	    this.jInternalFrameImportacionSerieProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSerieProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSerieProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSerieProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSerieProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSerieProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSerieProducto.setResizable(true);
	    this.jInternalFrameImportacionSerieProducto.setClosable(true);
	    this.jInternalFrameImportacionSerieProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSerieProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSerieProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSerieProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Serie Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSerieProducto = new JLabelMe();

		this.jLabelArchivoImportacionSerieProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSerieProducto.add(this.jLabelArchivoImportacionSerieProducto, this.gridBagConstraintsSerieProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSerieProducto = new JFileChooser();		
		this.jFileChooserImportacionSerieProducto.setToolTipText("ESCOGER ARCHIVO"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSerieProducto = new JButtonMe();
		this.jButtonAbrirImportacionSerieProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSerieProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSerieProducto.setToolTipText("Generar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSerieProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSerieProducto.add(this.jButtonAbrirImportacionSerieProducto, this.gridBagConstraintsSerieProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSerieProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionSerieProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsSerieProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSerieProducto.add(this.jLabelPathArchivoImportacionSerieProducto, this.gridBagConstraintsSerieProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSerieProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSerieProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSerieProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSerieProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSerieProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSerieProducto.add(this.jTextFieldPathArchivoImportacionSerieProducto, this.gridBagConstraintsSerieProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSerieProducto = new JButtonMe();
		this.jButtonGenerarImportacionSerieProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSerieProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSerieProducto.setToolTipText("Generar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSerieProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSerieProducto.add(this.jButtonGenerarImportacionSerieProducto, this.gridBagConstraintsSerieProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSerieProducto = new JButtonMe();
		this.jButtonCerrarImportacionSerieProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSerieProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSerieProducto.setToolTipText("Cancelar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSerieProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSerieProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSerieProducto.add(this.jButtonCerrarImportacionSerieProducto, this.gridBagConstraintsSerieProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSerieProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionSerieProducto= new JScrollPane(jPanelImportacionSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsSerieProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsSerieProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSerieProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSerieProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSerieProducto);
		this.jInternalFrameImportacionSerieProducto.getContentPane().add(this.jScrollPanelImportacionSerieProducto, this.gridBagConstraintsSerieProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySerieProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySerieProducto = new JButtonMe();
			this.jButtonAbrirOrderBySerieProducto.setText("Orden");
			this.jButtonAbrirOrderBySerieProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySerieProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySerieProducto";
			inputMap = this.jButtonAbrirOrderBySerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySerieProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderBySerieProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySerieProducto.setName("jPanelOrderBySerieProducto"); 
			
			this.jPanelOrderBySerieProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySerieProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySerieProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySerieProducto.setLayout(gridaBagLayoutOrderBySerieProducto);
			
			
			this.jTableDatosSerieProductoOrderBy = new JTableMe();        
			this.jTableDatosSerieProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSerieProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSerieProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSerieProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSerieProductoOrderBy.setViewportView(this.jTableDatosSerieProductoOrderBy);
			this.jTableDatosSerieProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSerieProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySerieProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySerieProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySerieProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSerieProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySerieProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySerieProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySerieProducto.setTitle("Orden");
			this.jInternalFrameOrderBySerieProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySerieProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySerieProducto.setResizable(true);
			this.jInternalFrameOrderBySerieProducto.setClosable(true);
			this.jInternalFrameOrderBySerieProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySerieProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySerieProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySerieProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Serie Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSerieProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSerieProducto.ipady =150;
				
			this.jPanelOrderBySerieProducto.add(jScrollPanelDatosSerieProductoOrderBy, this.gridBagConstraintsSerieProducto);//this.jTableDatosSerieProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySerieProducto = new JButtonMe();
			this.jButtonCerrarOrderBySerieProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySerieProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySerieProducto.setToolTipText("Cancelar"+" "+SerieProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSerieProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSerieProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySerieProducto.add(this.jButtonCerrarOrderBySerieProducto, this.gridBagConstraintsSerieProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSerieProducto = new GridBagLayout();
			
			this.jScrollPanelOrderBySerieProducto= new JScrollPane(jPanelOrderBySerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsSerieProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsSerieProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsSerieProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySerieProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySerieProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSerieProducto);
			
			this.jInternalFrameOrderBySerieProducto.getContentPane().add(this.jScrollPanelOrderBySerieProducto, this.gridBagConstraintsSerieProducto);			
		
		} else {
			this.jButtonAbrirOrderBySerieProducto = new JButtonMe();
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
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.serieproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSerieProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSerieProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSerieProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSerieProducto.getRowHeight();//SerieProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SerieProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSerieProducto.isSelected()) {
					iHeightTable=SerieProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SerieProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SerieProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SerieProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSerieProducto.isSelected()) {
					iHeightTable=SerieProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SerieProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SerieProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSerieProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSerieProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSerieProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSerieProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSerieProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSerieProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySerieProducto!=null && this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySerieProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySerieProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySerieProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSerieProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSerieProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSerieProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=serieproductoLogic.getSerieProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=serieproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SerieProducto> TraerSerieProductoBeans(List<SerieProducto> serieproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(SerieProducto serieproducto:serieproductos) {
					
				if(!(SerieProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SerieProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					serieproducto.setsDetalleGeneralEntityReporte(SerieProductoConstantesFunciones.getSerieProductoDescripcion(serieproducto));
										
						
					
					

					if(serieproducto.getDetalleSerieProductos()!=null && Funciones.existeClass(classes,DetalleSerieProducto.class)) {
						try{serieproducto.setdetalleserieproductosDescripcionReporte(new JRBeanCollectionDataSource(DetalleSerieProductoJInternalFrame.TraerDetalleSerieProductoBeans(serieproducto.getDetalleSerieProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//serieproducto.setsDetalleGeneralEntityReporte(serieproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//serieproductobeans.add(serieproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return serieproductos;
    }
	//PARA REPORTES FIN
}
