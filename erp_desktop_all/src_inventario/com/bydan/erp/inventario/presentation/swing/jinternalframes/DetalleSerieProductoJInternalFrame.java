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



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.inventario.util.DetalleSerieProductoConstantesFunciones;

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
public class DetalleSerieProductoJInternalFrame extends DetalleSerieProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleSerieProducto;
	
	protected JMenuBar jmenuBarDetalleSerieProducto;
	
	protected JMenu jmenuDetalleSerieProducto;
	protected JMenu jmenuDatosDetalleSerieProducto;
	protected JMenu jmenuArchivoDetalleSerieProducto;
	protected JMenu jmenuAccionesDetalleSerieProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleSerieProducto;	
	protected GridBagConstraints gridBagConstraintsDetalleSerieProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleSerieProductoDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleSerieProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleSerieProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleSerieProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SerieProductoBeanSwingJInternalFrame serieproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_serieproducto="";
	
	public DetalleSerieProductoSessionBean detalleserieproductoSessionBean;
		
	
	
	public SerieProductoSessionBean serieproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleSerieProducto> detalleserieproductos;		
	public List<DetalleSerieProducto> detalleserieproductosEliminados;	
	public List<DetalleSerieProducto> detalleserieproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleSerieProducto;		
	protected JButton jButtonAbrirOrderByDetalleSerieProducto;
	
	
	//protected JPanel jPanelOrderByDetalleSerieProducto;
	//public JScrollPane jScrollPanelOrderByDetalleSerieProducto;	
	//protected JButton jButtonCerrarOrderByDetalleSerieProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleSerieProductoLogic detalleserieproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleSerieProducto;
	public JScrollPane jScrollPanelDatosEdicionDetalleSerieProducto;
	public JScrollPane jScrollPanelDatosGeneralDetalleSerieProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleSerieProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleSerieProducto;
	//public JScrollPane jScrollPanelImportacionDetalleSerieProducto;
	
	
	
	protected JPanel jPanelAccionesDetalleSerieProducto;
	
    protected JPanel jPanelPaginacionDetalleSerieProducto;
    protected JPanel jPanelParametrosReportesDetalleSerieProducto;
	protected JPanel jPanelParametrosReportesAccionesDetalleSerieProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleSerieProducto;
	protected JPanel jPanelParametrosAuxiliar2DetalleSerieProducto;
	protected JPanel jPanelParametrosAuxiliar3DetalleSerieProducto;
	protected JPanel jPanelParametrosAuxiliar4DetalleSerieProducto;
	//protected JPanel jPanelParametrosAuxiliar5DetalleSerieProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleSerieProducto;
	//protected JPanel jPanelImportacionDetalleSerieProducto;
	
	
	public JTable jTableDatosDetalleSerieProducto;
	
	
	
	//public JTable jTableDatosDetalleSerieProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleSerieProducto;
	protected JButton jButtonDuplicarDetalleSerieProducto;
	protected JButton jButtonCopiarDetalleSerieProducto;
	protected JButton jButtonVerFormDetalleSerieProducto;
	protected JButton jButtonNuevoRelacionesDetalleSerieProducto;
	protected JButton jButtonModificarDetalleSerieProducto;
	
    protected JButton jButtonGuardarCambiosTablaDetalleSerieProducto;
	protected JButton jButtonCerrarDetalleSerieProducto;
	
	
	protected JButton jButtonRecargarInformacionDetalleSerieProducto;
	protected JButton jButtonProcesarInformacionDetalleSerieProducto;
	
	
	protected JButton jButtonAnterioresDetalleSerieProducto;
	protected JButton jButtonSiguientesDetalleSerieProducto;
	protected JButton jButtonNuevoGuardarCambiosDetalleSerieProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleSerieProducto;
	//protected JButton jButtonCerrarReporteDinamicoDetalleSerieProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleSerieProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleSerieProducto;
	//protected JButton jButtonGenerarImportacionDetalleSerieProducto;
	//protected JButton jButtonCerrarImportacionDetalleSerieProducto;
	//protected JFileChooser jFileChooserImportacionDetalleSerieProducto;
	//protected File fileImportacionDetalleSerieProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleSerieProducto;
	protected JButton jButtonDuplicarToolBarDetalleSerieProducto;
	protected JButton jButtonNuevoRelacionesToolBarDetalleSerieProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleSerieProducto;
	protected JButton jButtonCopiarToolBarDetalleSerieProducto;
	protected JButton jButtonVerFormToolBarDetalleSerieProducto;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleSerieProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleSerieProducto;
	protected JButton jButtonCerrarToolBarDetalleSerieProducto;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleSerieProducto;
	protected JButton jButtonProcesarInformacionToolBarDetalleSerieProducto;
	protected JButton jButtonAnterioresToolBarDetalleSerieProducto;
	protected JButton jButtonSiguientesToolBarDetalleSerieProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleSerieProducto;
	protected JButton jButtonAbrirOrderByToolBarDetalleSerieProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleSerieProducto;
	protected JMenuItem jMenuItemDuplicarDetalleSerieProducto;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleSerieProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleSerieProducto;
	protected JMenuItem jMenuItemCopiarDetalleSerieProducto;
	protected JMenuItem jMenuItemVerFormDetalleSerieProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleSerieProducto;
	protected JMenuItem jMenuItemCerrarDetalleSerieProducto;
	protected JMenuItem jMenuItemDetalleCerrarDetalleSerieProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleSerieProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleSerieProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleSerieProducto;
	protected JMenuItem jMenuItemProcesarInformacionDetalleSerieProducto;
	protected JMenuItem jMenuItemAnterioresDetalleSerieProducto;
	protected JMenuItem jMenuItemSiguientesDetalleSerieProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleSerieProducto;
	protected JMenuItem jMenuItemAbrirOrderByDetalleSerieProducto;
	protected JMenuItem jMenuItemMostrarOcultarDetalleSerieProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleSerieProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleSerieProducto;
	protected JCheckBox jCheckBoxSeleccionadosDetalleSerieProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleSerieProducto;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleSerieProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleSerieProducto;
	protected JTextField jTextFieldValorCampoGeneralDetalleSerieProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleSerieProducto;
	//public JList<Reporte> jListColumnasSelectReporteDetalleSerieProducto;
	//public JScrollPane jScrollColumnasSelectReporteDetalleSerieProducto;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleSerieProducto;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleSerieProducto;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleSerieProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleSerieProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleSerieProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleSerieProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleSerieProducto;
	
		
	//public JLabel jLabelArchivoImportacionDetalleSerieProducto;	
	//public JLabel jLabelPathArchivoImportacionDetalleSerieProducto;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleSerieProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleSerieProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleSerieProducto;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleSerieProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleSerieProducto;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleSerieProducto;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleSerieProducto;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleSerieProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleSerieProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleSerieProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleSerieProducto;
	public JPanel jPanelBusquedaPorNombreDetalleSerieProducto;
	public JButton jButtonBusquedaPorNombreDetalleSerieProducto;
	public JPanel jPanelFK_IdSerieProductoDetalleSerieProducto;
	public JButton jButtonFK_IdSerieProductoDetalleSerieProducto;
	
	public JPanel jPanelnombreBusquedaPorNombreDetalleSerieProducto;
	public JLabel jLabelnombreBusquedaPorNombreDetalleSerieProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreDetalleSerieProducto;
	public JButton jButtonnombreBusquedaPorNombreDetalleSerieProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_serie_productoFK_IdSerieProductoDetalleSerieProducto;
	public JLabel jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto;
	public JButton jButtonid_serie_productoFK_IdSerieProductoDetalleSerieProducto= new JButtonMe();
	public JButton jButtonid_serie_productoFK_IdSerieProductoDetalleSerieProductoUpdate= new JButtonMe();
	public JButton jButtonid_serie_productoFK_IdSerieProductoDetalleSerieProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public DetalleSerieProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleSerieProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleSerieProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleSerieProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleSerieProducto)	{
		this.jButtonRecargarInformacionDetalleSerieProducto = jButtonRecargarInformacionDetalleSerieProducto;
	}
	
	public JButton getjButtonProcesarInformacionDetalleSerieProducto() {
		return this.jButtonProcesarInformacionDetalleSerieProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleSerieProducto)	{
		this.jButtonProcesarInformacionDetalleSerieProducto = jButtonProcesarInformacionDetalleSerieProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleSerieProducto() {
		return this.jButtonRecargarInformacionDetalleSerieProducto;
	}
	
	
	public List<DetalleSerieProducto> getdetalleserieproductos() {
		return this.detalleserieproductos;
	}

	public void setdetalleserieproductos(List<DetalleSerieProducto> detalleserieproductos) {
		this.detalleserieproductos = detalleserieproductos;
	}
	
	public List<DetalleSerieProducto> getdetalleserieproductosAux() {
		return this.detalleserieproductosAux;
	}

	public void setdetalleserieproductosAux(List<DetalleSerieProducto> detalleserieproductosAux) {
		this.detalleserieproductosAux = detalleserieproductosAux;
	}
	
	public List<DetalleSerieProducto> getdetalleserieproductosEliminados() {
		return this.detalleserieproductosEliminados;
	}

	public void setDetalleSerieProductosEliminados(List<DetalleSerieProducto> detalleserieproductosEliminados) {
		this.detalleserieproductosEliminados = detalleserieproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleSerieProducto() {
		return jComboBoxTiposSeleccionarDetalleSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleSerieProducto(
			JComboBox jComboBoxTiposSeleccionarDetalleSerieProducto) {
		this.jComboBoxTiposSeleccionarDetalleSerieProducto = jComboBoxTiposSeleccionarDetalleSerieProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleSerieProducto() {
		return jTextFieldValorCampoGeneralDetalleSerieProducto;
	}

	public void setjTextFieldValorCampoGeneralDetalleSerieProducto(
			JTextField jTextFieldValorCampoGeneralDetalleSerieProducto) {
		this.jTextFieldValorCampoGeneralDetalleSerieProducto = jTextFieldValorCampoGeneralDetalleSerieProducto;
	}

	public void setBorderResaltarValorCampoGeneralDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleSerieProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleSerieProducto() {
		return this.jCheckBoxSeleccionarTodosDetalleSerieProducto;
	}

	public void setjCheckBoxSeleccionarTodosDetalleSerieProducto(
			JCheckBox jCheckBoxSeleccionarTodosDetalleSerieProducto) {
		this.jCheckBoxSeleccionarTodosDetalleSerieProducto = jCheckBoxSeleccionarTodosDetalleSerieProducto;
	}

	public void setBorderResaltarSeleccionarTodosDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleSerieProducto() {
		return this.jCheckBoxSeleccionadosDetalleSerieProducto;
	}

	public void setjCheckBoxSeleccionadosDetalleSerieProducto(
			JCheckBox jCheckBoxSeleccionadosDetalleSerieProducto) {
		this.jCheckBoxSeleccionadosDetalleSerieProducto = jCheckBoxSeleccionadosDetalleSerieProducto;
	}
	
	public void setBorderResaltarSeleccionadosDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleSerieProducto() {
		return this.jComboBoxTiposArchivosReportesDetalleSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleSerieProducto(
			JComboBox jComboBoxTiposArchivosReportesDetalleSerieProducto) {
		this.jComboBoxTiposArchivosReportesDetalleSerieProducto = jComboBoxTiposArchivosReportesDetalleSerieProducto;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleSerieProducto() {
		return this.jComboBoxTiposReportesDetalleSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleSerieProducto(
			JComboBox jComboBoxTiposReportesDetalleSerieProducto) {
		this.jComboBoxTiposReportesDetalleSerieProducto = jComboBoxTiposReportesDetalleSerieProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleSerieProducto() {
	//	return jComboBoxTiposReportesDinamicoDetalleSerieProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleSerieProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleSerieProducto) {
	//	this.jComboBoxTiposReportesDinamicoDetalleSerieProducto = jComboBoxTiposReportesDinamicoDetalleSerieProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto = jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto;
	//}
	
	public void setBorderResaltarTiposReportesDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleSerieProducto() {
		return this.jComboBoxTiposGraficosReportesDetalleSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleSerieProducto(
			JComboBox jComboBoxTiposGraficosReportesDetalleSerieProducto) {
		this.jComboBoxTiposGraficosReportesDetalleSerieProducto = jComboBoxTiposGraficosReportesDetalleSerieProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleSerieProducto() {
		return this.jComboBoxTiposPaginacionDetalleSerieProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleSerieProducto(
			JComboBox jComboBoxTiposPaginacionDetalleSerieProducto) {
		this.jComboBoxTiposPaginacionDetalleSerieProducto = jComboBoxTiposPaginacionDetalleSerieProducto;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleSerieProducto() {
		return this.jComboBoxTiposRelacionesDetalleSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleSerieProducto() {
		return this.jComboBoxTiposAccionesDetalleSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleSerieProducto(
			JComboBox jComboBoxTiposRelacionesDetalleSerieProducto) {
		this.jComboBoxTiposRelacionesDetalleSerieProducto = jComboBoxTiposRelacionesDetalleSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleSerieProducto(
			JComboBox jComboBoxTiposAccionesDetalleSerieProducto) {
		this.jComboBoxTiposAccionesDetalleSerieProducto = jComboBoxTiposAccionesDetalleSerieProducto;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleSerieProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleSerieProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleSerieProducto() {
	//	return jCheckBoxConGraficoDinamicoDetalleSerieProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleSerieProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleSerieProducto) {
	//	this.jCheckBoxConGraficoDinamicoDetalleSerieProducto = jCheckBoxConGraficoDinamicoDetalleSerieProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleSerieProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleSerieProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleSerieProducto .setBorder(borderResaltar);		
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
		this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
		
		this.detalleserieproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleserieproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleserieproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleSerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleSerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleSerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleSerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleSerieProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Serie Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleSerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSerieProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"nuevo","nuevo","Nuevo"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"duplicar","duplicar","Duplicar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"copiar","copiar","Copiar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"ver_form","ver_form","Ver"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"recargar","recargar","Recargar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,
							"cerrar","cerrar","Salir"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleSerieProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleSerieProducto;
			
				this.jButtonProcesarInformacionToolBarDetalleSerieProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleSerieProducto;
				
		//protected JButton jButtonModificarToolBarDetalleSerieProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleSerieProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleSerieProducto=new JMenuMe("General");
		this.jmenuArchivoDetalleSerieProducto=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleSerieProducto=new JMenuMe("Acciones");
		this.jmenuDatosDetalleSerieProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleSerieProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleSerieProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleSerieProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleSerieProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleSerieProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleSerieProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleSerieProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleSerieProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleSerieProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleSerieProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleSerieProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleSerieProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleSerieProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleSerieProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleSerieProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleSerieProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleSerieProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleSerieProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleSerieProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleSerieProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleSerieProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleSerieProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleSerieProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleSerieProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleSerieProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleSerieProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleSerieProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleSerieProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleSerieProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleSerieProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleSerieProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleSerieProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleSerieProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleSerieProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleSerieProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleSerieProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleSerieProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleSerieProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleSerieProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleSerieProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleSerieProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleSerieProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleSerieProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleSerieProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleSerieProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleSerieProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleSerieProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleSerieProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleSerieProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleSerieProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleSerieProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleSerieProducto.add(this.jMenuItemCerrarDetalleSerieProducto);
			
			this.jmenuAccionesDetalleSerieProducto.add(this.jMenuItemNuevoDetalleSerieProducto);
			this.jmenuAccionesDetalleSerieProducto.add(this.jMenuItemNuevoGuardarCambiosDetalleSerieProducto);
			this.jmenuAccionesDetalleSerieProducto.add(this.jMenuItemNuevoRelacionesDetalleSerieProducto);
			this.jmenuAccionesDetalleSerieProducto.add(this.jMenuItemGuardarCambiosTablaDetalleSerieProducto);		
			this.jmenuAccionesDetalleSerieProducto.add(this.jMenuItemDuplicarDetalleSerieProducto);		
			this.jmenuAccionesDetalleSerieProducto.add(this.jMenuItemCopiarDetalleSerieProducto);		
			this.jmenuAccionesDetalleSerieProducto.add(this.jMenuItemVerFormDetalleSerieProducto);		
			
			this.jmenuDatosDetalleSerieProducto.add(this.jMenuItemRecargarInformacionDetalleSerieProducto);				
			this.jmenuDatosDetalleSerieProducto.add(this.jMenuItemAnterioresDetalleSerieProducto);				
			this.jmenuDatosDetalleSerieProducto.add(this.jMenuItemSiguientesDetalleSerieProducto);				
			this.jmenuDatosDetalleSerieProducto.add(this.jMenuItemAbrirOrderByDetalleSerieProducto);				
			this.jmenuDatosDetalleSerieProducto.add(this.jMenuItemMostrarOcultarDetalleSerieProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleSerieProducto.add(this.jMenuItemGuardarCambiosDetalleSerieProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSerieProducto.add(this.jmenuArchivoDetalleSerieProducto);		
			this.jmenuBarDetalleSerieProducto.add(this.jmenuAccionesDetalleSerieProducto);		
			this.jmenuBarDetalleSerieProducto.add(this.jmenuDatosDetalleSerieProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleSerieProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleSerieProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreDetalleSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreDetalleSerieProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreDetalleSerieProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreDetalleSerieProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreDetalleSerieProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreDetalleSerieProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreDetalleSerieProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreDetalleSerieProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreDetalleSerieProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreDetalleSerieProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSerieProductoDetalleSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSerieProductoDetalleSerieProducto.setToolTipText("Buscar Por Serie Producto ");
		this.jButtonFK_IdSerieProductoDetalleSerieProducto= new JButtonMe();
		this.jButtonFK_IdSerieProductoDetalleSerieProducto.setText("Buscar");
		this.jButtonFK_IdSerieProductoDetalleSerieProducto.setToolTipText("Buscar Por Serie Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSerieProductoDetalleSerieProducto,"buscar_button","Buscar Por Serie Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSerieProductoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto = new JLabelMe();
		jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setText("Serie Producto :");
		jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setToolTipText("Serie Producto");
		jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto= new JComboBoxMe();
		jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleSerieProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleSerieProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleSerieProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleSerieProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleSerieProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleSerieProducto = new DetalleSerieProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Serie Producto DATOS");
			this.jInternalFrameDetalleFormDetalleSerieProducto = new DetalleSerieProductoDetalleFormJInternalFrame(jDesktopPane,this.detalleserieproductoSessionBean.getConGuardarRelaciones(),this.detalleserieproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleSerieProducto = null;//new DetalleSerieProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleSerieProducto= new GridBagLayout();
		
		
		this.jTableDatosDetalleSerieProducto = new JTableMe();      
		
		String sToolTipDetalleSerieProducto="";
		sToolTipDetalleSerieProducto=DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleSerieProducto+="(Inventario.DetalleSerieProducto)";
		}
		
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleSerieProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleSerieProducto.setToolTipText(sToolTipDetalleSerieProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleSerieProducto);
		this.jTableDatosDetalleSerieProducto.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleSerieProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleSerieProducto.setRowSelectionAllowed(true);
		this.jTableDatosDetalleSerieProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleSerieProducto = new JButtonMe();
		this.jButtonDuplicarDetalleSerieProducto = new JButtonMe();
		this.jButtonCopiarDetalleSerieProducto = new JButtonMe();
		this.jButtonVerFormDetalleSerieProducto = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleSerieProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleSerieProducto = new JButtonMe();
		this.jButtonCerrarDetalleSerieProducto = new JButtonMe();
		
		this.jScrollPanelDatosDetalleSerieProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleSerieProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Serie Producto";
		
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Serie Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleSerieProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleSerieProducto.setToolTipText("Acciones");
        this.jPanelAccionesDetalleSerieProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleSerieProducto=new ReporteDinamicoJInternalFrame(DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleSerieProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleSerieProducto=new ImportacionJInternalFrame(DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleSerieProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleSerieProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleSerieProducto.setText("Orden");
		this.jButtonAbrirOrderByDetalleSerieProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleSerieProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleSerieProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleSerieProducto,false,this);
			
			//this.cargarOrderByDetalleSerieProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleSerieProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleSerieProducto,true,this);
			
			//this.cargarOrderByDetalleSerieProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleSerieProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleSerieProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleSerieProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosDetalleSerieProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleSerieProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleSerieProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleSerieProducto.setText("Nuevo");
		this.jButtonDuplicarDetalleSerieProducto.setText("Duplicar");
		this.jButtonCopiarDetalleSerieProducto.setText("Copiar");
		this.jButtonVerFormDetalleSerieProducto.setText("Ver");
		this.jButtonNuevoRelacionesDetalleSerieProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.setText("Guardar");
		this.jButtonCerrarDetalleSerieProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleSerieProducto,"nuevo_button","Nuevo",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleSerieProducto,"duplicar_button","Duplicar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleSerieProducto,"copiar_button","Copiar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleSerieProducto,"ver_form","Ver",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleSerieProducto,"nuevorelaciones_button","Nuevo Rel",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleSerieProducto,"guardarcambiostabla_button","Guardar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleSerieProducto,"cerrar_button","Salir",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleSerieProducto.setToolTipText("Nuevo"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleSerieProducto.setToolTipText("Duplicar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleSerieProducto.setToolTipText("Copiar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleSerieProducto.setToolTipText("Ver"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleSerieProducto.setToolTipText("Nuevo Rel"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.setToolTipText("Guardar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleSerieProducto.setToolTipText("Salir"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleSerieProducto";
		inputMap = this.jButtonNuevoDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleSerieProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleSerieProducto";
		inputMap = this.jButtonDuplicarDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleSerieProducto"));
		
		//COPIAR
		sMapKey = "CopiarDetalleSerieProducto";
		inputMap = this.jButtonCopiarDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleSerieProducto"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleSerieProducto";
		inputMap = this.jButtonVerFormDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleSerieProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleSerieProducto";
		inputMap = this.jButtonNuevoRelacionesDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleSerieProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleSerieProducto";
		inputMap = this.jButtonModificarDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleSerieProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleSerieProducto";
		inputMap = this.jButtonCerrarDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleSerieProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleSerieProducto";
		inputMap = this.jButtonGuardarCambiosTablaDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleSerieProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleSerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleSerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleSerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleSerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleSerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleSerieProducto.setName("jPanelParametrosReportesDetalleSerieProducto"); 
		
		this.jPanelParametrosReportesAccionesDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleSerieProducto.setName("jPanelParametrosReportesAccionesDetalleSerieProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleSerieProducto = new JButtonMe();
		this.jButtonRecargarInformacionDetalleSerieProducto.setText("Recargar");
		this.jButtonRecargarInformacionDetalleSerieProducto.setToolTipText("Recargar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleSerieProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleSerieProducto = new JButtonMe();
		this.jButtonProcesarInformacionDetalleSerieProducto.setText("Procesar");
		this.jButtonProcesarInformacionDetalleSerieProducto.setToolTipText("Procesar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleSerieProducto.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleSerieProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleSerieProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleSerieProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleSerieProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleSerieProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleSerieProducto.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleSerieProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleSerieProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleSerieProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleSerieProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleSerieProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleSerieProducto.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleSerieProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleSerieProducto.setText("Accion");
		this.jComboBoxTiposAccionesDetalleSerieProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleSerieProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleSerieProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleSerieProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleSerieProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleSerieProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleSerieProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleSerieProducto = new JLabelMe();
		
		this.jLabelAccionesDetalleSerieProducto.setText("Acciones");		
		this.jLabelAccionesDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleSerieProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleSerieProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleSerieProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleSerieProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleSerieProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleSerieProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleSerieProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleSerieProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleSerieProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleSerieProducto = new JButtonMe();
		//this.jButtonAnterioresDetalleSerieProducto.setText("<<");
        this.jButtonAnterioresDetalleSerieProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleSerieProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleSerieProducto = new JButtonMe();
		//this.jButtonSiguientesDetalleSerieProducto.setText(">>");
        this.jButtonSiguientesDetalleSerieProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleSerieProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleSerieProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleSerieProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleSerieProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleSerieProducto,"nuevoguardarcambios_button","Nue",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleSerieProducto";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleSerieProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleSerieProducto";
		inputMap = this.jButtonRecargarInformacionDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleSerieProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleSerieProducto";
		inputMap = this.jButtonSiguientesDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleSerieProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleSerieProducto";
		inputMap = this.jButtonAnterioresDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleSerieProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleSerieProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleSerieProducto.setMinimumSize(new Dimension(this.getWidth(),DetalleSerieProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleSerieProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleSerieProducto.setMaximumSize(new Dimension(this.getWidth(),DetalleSerieProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleSerieProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleSerieProducto.setPreferredSize(new Dimension(this.getWidth(),DetalleSerieProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleSerieProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleSerieProducto = new GridBagLayout();

			this.jPanelPaginacionDetalleSerieProducto.setLayout(gridaBagLayoutPaginacionDetalleSerieProducto);						
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonAnterioresDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
					
						
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
			
			this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonNuevoGuardarCambiosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
						
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
			this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonSiguientesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 1;
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonNuevoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
						
			
			
			if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
				this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleSerieProducto.gridy = 1;
				this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonGuardarCambiosTablaDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			}
			
			
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 1;
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonDuplicarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 1;
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonCopiarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 1;
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonVerFormDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 1;
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleSerieProducto.add(this.jButtonCerrarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
		
		
		this.jButtonRecargarInformacionDetalleSerieProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleSerieProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleSerieProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleSerieProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleSerieProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleSerieProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleSerieProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleSerieProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleSerieProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleSerieProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleSerieProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleSerieProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleSerieProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleSerieProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleSerieProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleSerieProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleSerieProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleSerieProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleSerieProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleSerieProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleSerieProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleSerieProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleSerieProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleSerieProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleSerieProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleSerieProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleSerieProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleSerieProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleSerieProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleSerieProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleSerieProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleSerieProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleSerieProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleSerieProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleSerieProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleSerieProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleSerieProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleSerieProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleSerieProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleSerieProducto.setLayout(gridaBagParametrosReportesDetalleSerieProducto);
			this.jPanelParametrosReportesAccionesDetalleSerieProducto.setLayout(gridaBagParametrosReportesAccionesDetalleSerieProducto);
			
			
			this.jPanelParametrosAuxiliar1DetalleSerieProducto.setLayout(gridaBagParametrosAuxiliar1DetalleSerieProducto);
			this.jPanelParametrosAuxiliar2DetalleSerieProducto.setLayout(gridaBagParametrosAuxiliar2DetalleSerieProducto);
			this.jPanelParametrosAuxiliar3DetalleSerieProducto.setLayout(gridaBagParametrosAuxiliar3DetalleSerieProducto);
			this.jPanelParametrosAuxiliar4DetalleSerieProducto.setLayout(gridaBagParametrosAuxiliar4DetalleSerieProducto);
			//this.jPanelParametrosAuxiliar5DetalleSerieProducto.setLayout(gridaBagParametrosAuxiliar2DetalleSerieProducto);			
			
			
			
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jButtonRecargarInformacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleSerieProducto.add(this.jComboBoxTiposPaginacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleSerieProducto.add(this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleSerieProducto.add(this.jComboBoxTiposArchivosReportesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jPanelParametrosAuxiliar1DetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleSerieProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleSerieProducto.add(this.jComboBoxTiposReportesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jPanelParametrosAuxiliar4DetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jComboBoxTiposReportesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jCheckBoxGenerarReporteDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jPanelParametrosAuxiliar2DetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleSerieProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jLabelAccionesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
				this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleSerieProducto.add(this.jButtonAbrirOrderByDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jComboBoxTiposSeleccionarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
			
			
			/*
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleSerieProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jCheckBoxSeleccionarTodosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleSerieProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleSerieProducto.add(this.jCheckBoxSeleccionarTodosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);															
				
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleSerieProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleSerieProducto.add(this.jCheckBoxSeleccionadosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jPanelParametrosAuxiliar3DetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jComboBoxTiposAccionesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
	
				
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleSerieProducto.add(this.jTextFieldValorCampoGeneralDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleSerieProducto = new GridBagLayout();

			this.jScrollPanelDatosDetalleSerieProducto.setLayout(gridaBagLayoutDatosDetalleSerieProducto);
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
			this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
			
			this.jScrollPanelDatosDetalleSerieProducto.add(this.jTableDatosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleSerieProducto.setViewportView(this.jTableDatosDetalleSerieProducto);
		this.jTableDatosDetalleSerieProducto.setFillsViewportHeight(true);
		this.jTableDatosDetalleSerieProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleSerieProducto= new GridBagLayout();
		this.jPanelAccionesDetalleSerieProducto.setLayout(gridaBagLayoutAccionesDetalleSerieProducto);
		
		
		/*	
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
			
		this.jPanelAccionesDetalleSerieProducto.add(this.jButtonNuevoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreDetalleSerieProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreDetalleSerieProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreDetalleSerieProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreDetalleSerieProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreDetalleSerieProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreDetalleSerieProducto.setLayout(gridaBagLayoutBusquedaPorNombreDetalleSerieProducto);

		gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleSerieProducto.gridy = 0;
		gridBagConstraintsDetalleSerieProducto.gridx = 0;
		jPanelBusquedaPorNombreDetalleSerieProducto.add(jLabelnombreBusquedaPorNombreDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);

		gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleSerieProducto.gridy = 0;
		gridBagConstraintsDetalleSerieProducto.gridx = 1;
		jPanelBusquedaPorNombreDetalleSerieProducto.add(jTextAreanombreBusquedaPorNombreDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);

		gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleSerieProducto.gridy = 1;
		gridBagConstraintsDetalleSerieProducto.gridx =1;
		jPanelBusquedaPorNombreDetalleSerieProducto.add(jButtonBusquedaPorNombreDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);

		jTabbedPaneBusquedasDetalleSerieProducto.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreDetalleSerieProducto);
		jTabbedPaneBusquedasDetalleSerieProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdSerieProductoDetalleSerieProducto= new GridBagLayout();
		gridaBagLayoutFK_IdSerieProductoDetalleSerieProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSerieProductoDetalleSerieProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSerieProductoDetalleSerieProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSerieProductoDetalleSerieProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSerieProductoDetalleSerieProducto.setLayout(gridaBagLayoutFK_IdSerieProductoDetalleSerieProducto);

		gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleSerieProducto.gridy = 0;
		gridBagConstraintsDetalleSerieProducto.gridx = 0;
		jPanelFK_IdSerieProductoDetalleSerieProducto.add(jLabelid_serie_productoFK_IdSerieProductoDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);

		gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleSerieProducto.gridy = 0;
		gridBagConstraintsDetalleSerieProducto.gridx = 1;
		jPanelFK_IdSerieProductoDetalleSerieProducto.add(jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);

		gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleSerieProducto.gridy = 1;
		gridBagConstraintsDetalleSerieProducto.gridx =1;
		jPanelFK_IdSerieProductoDetalleSerieProducto.add(jButtonFK_IdSerieProductoDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);

		jTabbedPaneBusquedasDetalleSerieProducto.addTab("2.-Por Serie Producto ", jPanelFK_IdSerieProductoDetalleSerieProducto);
		jTabbedPaneBusquedasDetalleSerieProducto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleSerieProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleSerieProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();						
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleSerieProducto.gridx = 0;		
			//this.gridBagConstraintsDetalleSerieProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleSerieProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;		
		//this.gridBagConstraintsDetalleSerieProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleSerieProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleSerieProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleSerieProducto.gridx = 0;		
			this.gridBagConstraintsDetalleSerieProducto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleSerieProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);								
		
		
		/*
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		*/		
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleSerieProducto.gridx =0;
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleSerieProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
				
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleSerieProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleSerieProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleSerieProducto.setLayout(gridaBagLayoutBusquedasParametrosDetalleSerieProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleSerieProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleSerieProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleSerieProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleSerieProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			
			
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
			
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleSerieProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleSerieProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleSerieProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleSerieProducto.setName("jPanelReporteDinamicoDetalleSerieProducto"); 
		
		this.jPanelReporteDinamicoDetalleSerieProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleSerieProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleSerieProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleSerieProducto.setLayout(gridaBagLayoutReporteDinamicoDetalleSerieProducto);
		
		
		this.jInternalFrameReporteDinamicoDetalleSerieProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleSerieProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleSerieProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleSerieProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleSerieProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleSerieProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleSerieProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleSerieProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleSerieProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleSerieProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleSerieProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleSerieProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleSerieProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleSerieProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Serie Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleSerieProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleSerieProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jLabelColumnasSelectReporteDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleSerieProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleSerieProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleSerieProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleSerieProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleSerieProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleSerieProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleSerieProducto=new JScrollPane(this.jListColumnasSelectReporteDetalleSerieProducto);
			
			this.jScrollColumnasSelectReporteDetalleSerieProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleSerieProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleSerieProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jListColumnasSelectReporteDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jScrollColumnasSelectReporteDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleSerieProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleSerieProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleSerieProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleSerieProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleSerieProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleSerieProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleSerieProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleSerieProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleSerieProducto=new JScrollPane(this.jListRelacionesSelectReporteDetalleSerieProducto);
			
			this.jScrollRelacionesSelectReporteDetalleSerieProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleSerieProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleSerieProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleSerieProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleSerieProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleSerieProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleSerieProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleSerieProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleSerieProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleSerieProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleSerieProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleSerieProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleSerieProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jLabelGenerarExcelReporteDinamicoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleSerieProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleSerieProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleSerieProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleSerieProducto.setToolTipText("Generar EXCEL"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jButtonGenerarExcelReporteDinamicoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jComboBoxTiposReportesDinamicoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleSerieProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleSerieProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jLabelTiposArchivoReporteDinamicoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleSerieProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleSerieProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleSerieProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleSerieProducto.setToolTipText("Generar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jButtonGenerarReporteDinamicoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleSerieProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleSerieProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleSerieProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleSerieProducto.setToolTipText("Cancelar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleSerieProducto.add(this.jButtonCerrarReporteDinamicoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleSerieProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleSerieProducto= new JScrollPane(jPanelReporteDinamicoDetalleSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleSerieProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleSerieProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleSerieProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Serie Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleSerieProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleSerieProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleSerieProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleSerieProducto);
		this.jInternalFrameReporteDinamicoDetalleSerieProducto.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleSerieProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleSerieProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleSerieProducto.setName("jPanelImportacionDetalleSerieProducto"); 
		
		this.jPanelImportacionDetalleSerieProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleSerieProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleSerieProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleSerieProducto.setLayout(gridaBagLayoutImportacionDetalleSerieProducto);
		
		
		this.jInternalFrameImportacionDetalleSerieProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleSerieProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleSerieProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleSerieProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleSerieProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleSerieProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleSerieProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleSerieProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleSerieProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleSerieProducto.setResizable(true);
	    this.jInternalFrameImportacionDetalleSerieProducto.setClosable(true);
	    this.jInternalFrameImportacionDetalleSerieProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleSerieProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleSerieProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleSerieProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleSerieProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleSerieProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleSerieProducto.setResizable(true);
	    this.jInternalFrameImportacionDetalleSerieProducto.setClosable(true);
	    this.jInternalFrameImportacionDetalleSerieProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleSerieProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleSerieProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleSerieProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Serie Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleSerieProducto = new JLabelMe();

		this.jLabelArchivoImportacionDetalleSerieProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleSerieProducto.add(this.jLabelArchivoImportacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleSerieProducto = new JFileChooser();		
		this.jFileChooserImportacionDetalleSerieProducto.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleSerieProducto = new JButtonMe();
		this.jButtonAbrirImportacionDetalleSerieProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleSerieProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleSerieProducto.setToolTipText("Generar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleSerieProducto.add(this.jButtonAbrirImportacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleSerieProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleSerieProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleSerieProducto.add(this.jLabelPathArchivoImportacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleSerieProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleSerieProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleSerieProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleSerieProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleSerieProducto.add(this.jTextFieldPathArchivoImportacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleSerieProducto = new JButtonMe();
		this.jButtonGenerarImportacionDetalleSerieProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleSerieProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleSerieProducto.setToolTipText("Generar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleSerieProducto.add(this.jButtonGenerarImportacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleSerieProducto = new JButtonMe();
		this.jButtonCerrarImportacionDetalleSerieProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleSerieProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleSerieProducto.setToolTipText("Cancelar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleSerieProducto.add(this.jButtonCerrarImportacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleSerieProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleSerieProducto= new JScrollPane(jPanelImportacionDetalleSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleSerieProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleSerieProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleSerieProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleSerieProducto);
		this.jInternalFrameImportacionDetalleSerieProducto.getContentPane().add(this.jScrollPanelImportacionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleSerieProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleSerieProducto = new JButtonMe();
			this.jButtonAbrirOrderByDetalleSerieProducto.setText("Orden");
			this.jButtonAbrirOrderByDetalleSerieProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleSerieProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleSerieProducto";
			inputMap = this.jButtonAbrirOrderByDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleSerieProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleSerieProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleSerieProducto.setName("jPanelOrderByDetalleSerieProducto"); 
			
			this.jPanelOrderByDetalleSerieProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleSerieProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleSerieProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleSerieProducto.setLayout(gridaBagLayoutOrderByDetalleSerieProducto);
			
			
			this.jTableDatosDetalleSerieProductoOrderBy = new JTableMe();        
			this.jTableDatosDetalleSerieProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleSerieProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleSerieProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleSerieProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleSerieProductoOrderBy.setViewportView(this.jTableDatosDetalleSerieProductoOrderBy);
			this.jTableDatosDetalleSerieProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleSerieProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleSerieProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleSerieProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleSerieProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleSerieProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleSerieProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleSerieProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleSerieProducto.setTitle("Orden");
			this.jInternalFrameOrderByDetalleSerieProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleSerieProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleSerieProducto.setResizable(true);
			this.jInternalFrameOrderByDetalleSerieProducto.setClosable(true);
			this.jInternalFrameOrderByDetalleSerieProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleSerieProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleSerieProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleSerieProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Serie Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleSerieProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleSerieProducto.ipady =150;
				
			this.jPanelOrderByDetalleSerieProducto.add(jScrollPanelDatosDetalleSerieProductoOrderBy, this.gridBagConstraintsDetalleSerieProducto);//this.jTableDatosDetalleSerieProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleSerieProducto = new JButtonMe();
			this.jButtonCerrarOrderByDetalleSerieProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleSerieProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleSerieProducto.setToolTipText("Cancelar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleSerieProducto.add(this.jButtonCerrarOrderByDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleSerieProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleSerieProducto= new JScrollPane(jPanelOrderByDetalleSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleSerieProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleSerieProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleSerieProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleSerieProducto);
			
			this.jInternalFrameOrderByDetalleSerieProducto.getContentPane().add(this.jScrollPanelOrderByDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
		
		} else {
			this.jButtonAbrirOrderByDetalleSerieProducto = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleserieproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleSerieProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleSerieProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleSerieProducto.getRowHeight();//DetalleSerieProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleSerieProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto.isSelected()) {
					iHeightTable=DetalleSerieProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleSerieProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleSerieProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleSerieProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleSerieProducto.isSelected()) {
					iHeightTable=DetalleSerieProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleSerieProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleSerieProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleSerieProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleSerieProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleSerieProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleSerieProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleSerieProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleSerieProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleSerieProducto!=null && this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleSerieProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleSerieProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleSerieProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleSerieProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleSerieProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleSerieProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleserieproductoLogic.getDetalleSerieProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleserieproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleSerieProducto> TraerDetalleSerieProductoBeans(List<DetalleSerieProducto> detalleserieproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleSerieProducto detalleserieproducto:detalleserieproductos) {
					
				if(!(DetalleSerieProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleSerieProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleserieproducto.setsDetalleGeneralEntityReporte(DetalleSerieProductoConstantesFunciones.getDetalleSerieProductoDescripcion(detalleserieproducto));
										
						
					
						
					
				} else  {
							
					//detalleserieproducto.setsDetalleGeneralEntityReporte(detalleserieproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleserieproductobeans.add(detalleserieproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleserieproductos;
    }
	//PARA REPORTES FIN
}
