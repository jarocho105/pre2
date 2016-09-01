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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoProductoServicioConstantesFunciones;

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
public class TipoProductoServicioJInternalFrame extends TipoProductoServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProductoServicio;
	
	protected JMenuBar jmenuBarTipoProductoServicio;
	
	protected JMenu jmenuTipoProductoServicio;
	protected JMenu jmenuDatosTipoProductoServicio;
	protected JMenu jmenuArchivoTipoProductoServicio;
	protected JMenu jmenuAccionesTipoProductoServicio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProductoServicio;	
	protected GridBagConstraints gridBagConstraintsTipoProductoServicio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProductoServicioDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProductoServicio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProductoServicio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProductoServicio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProductoServicio> tipoproductoservicios;		
	public List<TipoProductoServicio> tipoproductoserviciosEliminados;	
	public List<TipoProductoServicio> tipoproductoserviciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProductoServicio;		
	protected JButton jButtonAbrirOrderByTipoProductoServicio;
	
	
	//protected JPanel jPanelOrderByTipoProductoServicio;
	//public JScrollPane jScrollPanelOrderByTipoProductoServicio;	
	//protected JButton jButtonCerrarOrderByTipoProductoServicio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProductoServicioLogic tipoproductoservicioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProductoServicio;
	public JScrollPane jScrollPanelDatosEdicionTipoProductoServicio;
	public JScrollPane jScrollPanelDatosGeneralTipoProductoServicio;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProductoServicioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProductoServicio;
	//public JScrollPane jScrollPanelImportacionTipoProductoServicio;
	
	
	
	protected JPanel jPanelAccionesTipoProductoServicio;
	
    protected JPanel jPanelPaginacionTipoProductoServicio;
    protected JPanel jPanelParametrosReportesTipoProductoServicio;
	protected JPanel jPanelParametrosReportesAccionesTipoProductoServicio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProductoServicio;
	protected JPanel jPanelParametrosAuxiliar2TipoProductoServicio;
	protected JPanel jPanelParametrosAuxiliar3TipoProductoServicio;
	protected JPanel jPanelParametrosAuxiliar4TipoProductoServicio;
	//protected JPanel jPanelParametrosAuxiliar5TipoProductoServicio;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProductoServicio;
	//protected JPanel jPanelImportacionTipoProductoServicio;
	
	
	public JTable jTableDatosTipoProductoServicio;
	
	
	
	//public JTable jTableDatosTipoProductoServicioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProductoServicio;
	protected JButton jButtonDuplicarTipoProductoServicio;
	protected JButton jButtonCopiarTipoProductoServicio;
	protected JButton jButtonVerFormTipoProductoServicio;
	protected JButton jButtonNuevoRelacionesTipoProductoServicio;
	protected JButton jButtonModificarTipoProductoServicio;
	
    protected JButton jButtonGuardarCambiosTablaTipoProductoServicio;
	protected JButton jButtonCerrarTipoProductoServicio;
	
	
	protected JButton jButtonRecargarInformacionTipoProductoServicio;
	protected JButton jButtonProcesarInformacionTipoProductoServicio;
	
	
	protected JButton jButtonAnterioresTipoProductoServicio;
	protected JButton jButtonSiguientesTipoProductoServicio;
	protected JButton jButtonNuevoGuardarCambiosTipoProductoServicio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProductoServicio;
	//protected JButton jButtonCerrarReporteDinamicoTipoProductoServicio;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProductoServicio;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProductoServicio;
	//protected JButton jButtonGenerarImportacionTipoProductoServicio;
	//protected JButton jButtonCerrarImportacionTipoProductoServicio;
	//protected JFileChooser jFileChooserImportacionTipoProductoServicio;
	//protected File fileImportacionTipoProductoServicio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProductoServicio;
	protected JButton jButtonDuplicarToolBarTipoProductoServicio;
	protected JButton jButtonNuevoRelacionesToolBarTipoProductoServicio;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProductoServicio;
	protected JButton jButtonCopiarToolBarTipoProductoServicio;
	protected JButton jButtonVerFormToolBarTipoProductoServicio;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProductoServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProductoServicio;
	protected JButton jButtonCerrarToolBarTipoProductoServicio;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProductoServicio;
	protected JButton jButtonProcesarInformacionToolBarTipoProductoServicio;
	protected JButton jButtonAnterioresToolBarTipoProductoServicio;
	protected JButton jButtonSiguientesToolBarTipoProductoServicio;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProductoServicio;
	protected JButton jButtonAbrirOrderByToolBarTipoProductoServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProductoServicio;
	protected JMenuItem jMenuItemDuplicarTipoProductoServicio;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProductoServicio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProductoServicio;
	protected JMenuItem jMenuItemCopiarTipoProductoServicio;
	protected JMenuItem jMenuItemVerFormTipoProductoServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProductoServicio;
	protected JMenuItem jMenuItemCerrarTipoProductoServicio;
	protected JMenuItem jMenuItemDetalleCerrarTipoProductoServicio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProductoServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProductoServicio;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProductoServicio;
	protected JMenuItem jMenuItemProcesarInformacionTipoProductoServicio;
	protected JMenuItem jMenuItemAnterioresTipoProductoServicio;
	protected JMenuItem jMenuItemSiguientesTipoProductoServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProductoServicio;
	protected JMenuItem jMenuItemAbrirOrderByTipoProductoServicio;
	protected JMenuItem jMenuItemMostrarOcultarTipoProductoServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProductoServicio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProductoServicio;
	protected JCheckBox jCheckBoxSeleccionadosTipoProductoServicio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProductoServicio;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProductoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProductoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProductoServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProductoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProductoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProductoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProductoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProductoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProductoServicio;
	protected JTextField jTextFieldValorCampoGeneralTipoProductoServicio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProductoServicio;
	//public JList<Reporte> jListColumnasSelectReporteTipoProductoServicio;
	//public JScrollPane jScrollColumnasSelectReporteTipoProductoServicio;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProductoServicio;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProductoServicio;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProductoServicio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProductoServicio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProductoServicio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProductoServicio;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProductoServicio;
	
		
	//public JLabel jLabelArchivoImportacionTipoProductoServicio;	
	//public JLabel jLabelPathArchivoImportacionTipoProductoServicio;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProductoServicio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProductoServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProductoServicio;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProductoServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProductoServicio;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProductoServicio;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProductoServicio;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProductoServicio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProductoServicio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProductoServicio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoProductoServicio;
	public JPanel jPanelBusquedaPorNombreTipoProductoServicio;
	public JButton jButtonBusquedaPorNombreTipoProductoServicio;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoProductoServicio;
	public JLabel jLabelnombreBusquedaPorNombreTipoProductoServicio;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoProductoServicio;
	public JButton jButtonnombreBusquedaPorNombreTipoProductoServicioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoProductoServicioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProductoServicio)	{
		this.jButtonRecargarInformacionTipoProductoServicio = jButtonRecargarInformacionTipoProductoServicio;
	}
	
	public JButton getjButtonProcesarInformacionTipoProductoServicio() {
		return this.jButtonProcesarInformacionTipoProductoServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProductoServicio)	{
		this.jButtonProcesarInformacionTipoProductoServicio = jButtonProcesarInformacionTipoProductoServicio;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProductoServicio() {
		return this.jButtonRecargarInformacionTipoProductoServicio;
	}
	
	
	public List<TipoProductoServicio> gettipoproductoservicios() {
		return this.tipoproductoservicios;
	}

	public void settipoproductoservicios(List<TipoProductoServicio> tipoproductoservicios) {
		this.tipoproductoservicios = tipoproductoservicios;
	}
	
	public List<TipoProductoServicio> gettipoproductoserviciosAux() {
		return this.tipoproductoserviciosAux;
	}

	public void settipoproductoserviciosAux(List<TipoProductoServicio> tipoproductoserviciosAux) {
		this.tipoproductoserviciosAux = tipoproductoserviciosAux;
	}
	
	public List<TipoProductoServicio> gettipoproductoserviciosEliminados() {
		return this.tipoproductoserviciosEliminados;
	}

	public void setTipoProductoServiciosEliminados(List<TipoProductoServicio> tipoproductoserviciosEliminados) {
		this.tipoproductoserviciosEliminados = tipoproductoserviciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProductoServicio() {
		return jComboBoxTiposSeleccionarTipoProductoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProductoServicio(
			JComboBox jComboBoxTiposSeleccionarTipoProductoServicio) {
		this.jComboBoxTiposSeleccionarTipoProductoServicio = jComboBoxTiposSeleccionarTipoProductoServicio;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProductoServicio() {
		return jTextFieldValorCampoGeneralTipoProductoServicio;
	}

	public void setjTextFieldValorCampoGeneralTipoProductoServicio(
			JTextField jTextFieldValorCampoGeneralTipoProductoServicio) {
		this.jTextFieldValorCampoGeneralTipoProductoServicio = jTextFieldValorCampoGeneralTipoProductoServicio;
	}

	public void setBorderResaltarValorCampoGeneralTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProductoServicio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProductoServicio() {
		return this.jCheckBoxSeleccionarTodosTipoProductoServicio;
	}

	public void setjCheckBoxSeleccionarTodosTipoProductoServicio(
			JCheckBox jCheckBoxSeleccionarTodosTipoProductoServicio) {
		this.jCheckBoxSeleccionarTodosTipoProductoServicio = jCheckBoxSeleccionarTodosTipoProductoServicio;
	}

	public void setBorderResaltarSeleccionarTodosTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProductoServicio() {
		return this.jCheckBoxSeleccionadosTipoProductoServicio;
	}

	public void setjCheckBoxSeleccionadosTipoProductoServicio(
			JCheckBox jCheckBoxSeleccionadosTipoProductoServicio) {
		this.jCheckBoxSeleccionadosTipoProductoServicio = jCheckBoxSeleccionadosTipoProductoServicio;
	}
	
	public void setBorderResaltarSeleccionadosTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProductoServicio() {
		return this.jComboBoxTiposArchivosReportesTipoProductoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProductoServicio(
			JComboBox jComboBoxTiposArchivosReportesTipoProductoServicio) {
		this.jComboBoxTiposArchivosReportesTipoProductoServicio = jComboBoxTiposArchivosReportesTipoProductoServicio;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProductoServicio() {
		return this.jComboBoxTiposReportesTipoProductoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProductoServicio(
			JComboBox jComboBoxTiposReportesTipoProductoServicio) {
		this.jComboBoxTiposReportesTipoProductoServicio = jComboBoxTiposReportesTipoProductoServicio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProductoServicio() {
	//	return jComboBoxTiposReportesDinamicoTipoProductoServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProductoServicio(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProductoServicio) {
	//	this.jComboBoxTiposReportesDinamicoTipoProductoServicio = jComboBoxTiposReportesDinamicoTipoProductoServicio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProductoServicio() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProductoServicio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio = jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio;
	//}
	
	public void setBorderResaltarTiposReportesTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProductoServicio() {
		return this.jComboBoxTiposGraficosReportesTipoProductoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProductoServicio(
			JComboBox jComboBoxTiposGraficosReportesTipoProductoServicio) {
		this.jComboBoxTiposGraficosReportesTipoProductoServicio = jComboBoxTiposGraficosReportesTipoProductoServicio;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProductoServicio() {
		return this.jComboBoxTiposPaginacionTipoProductoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProductoServicio(
			JComboBox jComboBoxTiposPaginacionTipoProductoServicio) {
		this.jComboBoxTiposPaginacionTipoProductoServicio = jComboBoxTiposPaginacionTipoProductoServicio;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProductoServicio() {
		return this.jComboBoxTiposRelacionesTipoProductoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProductoServicio() {
		return this.jComboBoxTiposAccionesTipoProductoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProductoServicio(
			JComboBox jComboBoxTiposRelacionesTipoProductoServicio) {
		this.jComboBoxTiposRelacionesTipoProductoServicio = jComboBoxTiposRelacionesTipoProductoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProductoServicio(
			JComboBox jComboBoxTiposAccionesTipoProductoServicio) {
		this.jComboBoxTiposAccionesTipoProductoServicio = jComboBoxTiposAccionesTipoProductoServicio;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProductoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProductoServicio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProductoServicio() {
	//	return jCheckBoxConGraficoDinamicoTipoProductoServicio;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProductoServicio(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProductoServicio) {
	//	this.jCheckBoxConGraficoDinamicoTipoProductoServicio = jCheckBoxConGraficoDinamicoTipoProductoServicio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProductoServicio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProductoServicio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProductoServicio .setBorder(borderResaltar);		
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
		this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
		
		this.tipoproductoservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoproductoservicioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProductoServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Producto Servicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProductoServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProductoServicio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"nuevo","nuevo","Nuevo"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"duplicar","duplicar","Duplicar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"copiar","copiar","Copiar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"ver_form","ver_form","Ver"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"recargar","recargar","Recargar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProductoServicio,this.jTtoolBarTipoProductoServicio,
							"cerrar","cerrar","Salir"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProductoServicio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProductoServicio;
			
				this.jButtonProcesarInformacionToolBarTipoProductoServicio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProductoServicio;
				
		//protected JButton jButtonModificarToolBarTipoProductoServicio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProductoServicio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProductoServicio=new JMenuMe("General");
		this.jmenuArchivoTipoProductoServicio=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProductoServicio=new JMenuMe("Acciones");
		this.jmenuDatosTipoProductoServicio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProductoServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProductoServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProductoServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProductoServicio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProductoServicio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProductoServicio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProductoServicio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProductoServicio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProductoServicio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProductoServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProductoServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProductoServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProductoServicio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProductoServicio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProductoServicio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProductoServicio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProductoServicio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProductoServicio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProductoServicio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProductoServicio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProductoServicio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProductoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProductoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProductoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProductoServicio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProductoServicio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProductoServicio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProductoServicio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProductoServicio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProductoServicio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProductoServicio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProductoServicio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProductoServicio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProductoServicio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProductoServicio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProductoServicio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProductoServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProductoServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProductoServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProductoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProductoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProductoServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProductoServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProductoServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProductoServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProductoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProductoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProductoServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProductoServicio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProductoServicio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProductoServicio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProductoServicio.add(this.jMenuItemCerrarTipoProductoServicio);
			
			this.jmenuAccionesTipoProductoServicio.add(this.jMenuItemNuevoTipoProductoServicio);
			this.jmenuAccionesTipoProductoServicio.add(this.jMenuItemNuevoGuardarCambiosTipoProductoServicio);
			this.jmenuAccionesTipoProductoServicio.add(this.jMenuItemNuevoRelacionesTipoProductoServicio);
			this.jmenuAccionesTipoProductoServicio.add(this.jMenuItemGuardarCambiosTablaTipoProductoServicio);		
			this.jmenuAccionesTipoProductoServicio.add(this.jMenuItemDuplicarTipoProductoServicio);		
			this.jmenuAccionesTipoProductoServicio.add(this.jMenuItemCopiarTipoProductoServicio);		
			this.jmenuAccionesTipoProductoServicio.add(this.jMenuItemVerFormTipoProductoServicio);		
			
			this.jmenuDatosTipoProductoServicio.add(this.jMenuItemRecargarInformacionTipoProductoServicio);				
			this.jmenuDatosTipoProductoServicio.add(this.jMenuItemAnterioresTipoProductoServicio);				
			this.jmenuDatosTipoProductoServicio.add(this.jMenuItemSiguientesTipoProductoServicio);				
			this.jmenuDatosTipoProductoServicio.add(this.jMenuItemAbrirOrderByTipoProductoServicio);				
			this.jmenuDatosTipoProductoServicio.add(this.jMenuItemMostrarOcultarTipoProductoServicio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProductoServicio.add(this.jMenuItemGuardarCambiosTipoProductoServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProductoServicio.add(this.jmenuArchivoTipoProductoServicio);		
			this.jmenuBarTipoProductoServicio.add(this.jmenuAccionesTipoProductoServicio);		
			this.jmenuBarTipoProductoServicio.add(this.jmenuDatosTipoProductoServicio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProductoServicio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProductoServicio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoProductoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoProductoServicio.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoProductoServicio= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoProductoServicio.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoProductoServicio.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoProductoServicio,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoProductoServicio = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoProductoServicio.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoProductoServicio.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoProductoServicio= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoProductoServicio=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoProductoServicio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProductoServicio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProductoServicio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoProductoServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoProductoServicio = new TipoProductoServicioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Producto Servicio DATOS");
			this.jInternalFrameDetalleFormTipoProductoServicio = new TipoProductoServicioDetalleFormJInternalFrame(jDesktopPane,this.tipoproductoservicioSessionBean.getConGuardarRelaciones(),this.tipoproductoservicioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProductoServicio = null;//new TipoProductoServicioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProductoServicio= new GridBagLayout();
		
		
		this.jTableDatosTipoProductoServicio = new JTableMe();      
		
		String sToolTipTipoProductoServicio="";
		sToolTipTipoProductoServicio=TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProductoServicio+="(Facturacion.TipoProductoServicio)";
		}
		
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProductoServicio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProductoServicio.setToolTipText(sToolTipTipoProductoServicio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProductoServicio);
		this.jTableDatosTipoProductoServicio.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProductoServicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProductoServicio.setRowSelectionAllowed(true);
		this.jTableDatosTipoProductoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProductoServicio = new JButtonMe();
		this.jButtonDuplicarTipoProductoServicio = new JButtonMe();
		this.jButtonCopiarTipoProductoServicio = new JButtonMe();
		this.jButtonVerFormTipoProductoServicio = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProductoServicio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProductoServicio = new JButtonMe();
		this.jButtonCerrarTipoProductoServicio = new JButtonMe();
		
		this.jScrollPanelDatosTipoProductoServicio = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProductoServicio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Producto Servicio";
		
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProductoServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProductoServicio.setToolTipText("Acciones");
        this.jPanelAccionesTipoProductoServicio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProductoServicio=new ReporteDinamicoJInternalFrame(TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProductoServicio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProductoServicio=new ImportacionJInternalFrame(TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProductoServicio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProductoServicio = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProductoServicio.setText("Orden");
		this.jButtonAbrirOrderByTipoProductoServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProductoServicio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProductoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProductoServicio,false,this);
			
			//this.cargarOrderByTipoProductoServicio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProductoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProductoServicio,true,this);
			
			//this.cargarOrderByTipoProductoServicio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProductoServicio.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoProductoServicio.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoProductoServicio.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoProductoServicio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProductoServicio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProductoServicio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProductoServicio.setText("Nuevo");
		this.jButtonDuplicarTipoProductoServicio.setText("Duplicar");
		this.jButtonCopiarTipoProductoServicio.setText("Copiar");
		this.jButtonVerFormTipoProductoServicio.setText("Ver");
		this.jButtonNuevoRelacionesTipoProductoServicio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProductoServicio.setText("Guardar");
		this.jButtonCerrarTipoProductoServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProductoServicio,"nuevo_button","Nuevo",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProductoServicio,"duplicar_button","Duplicar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProductoServicio,"copiar_button","Copiar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProductoServicio,"ver_form","Ver",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProductoServicio,"nuevorelaciones_button","Nuevo Rel",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProductoServicio,"guardarcambiostabla_button","Guardar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProductoServicio,"cerrar_button","Salir",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProductoServicio.setToolTipText("Nuevo"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProductoServicio.setToolTipText("Duplicar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProductoServicio.setToolTipText("Copiar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProductoServicio.setToolTipText("Ver"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProductoServicio.setToolTipText("Nuevo Rel"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProductoServicio.setToolTipText("Guardar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProductoServicio.setToolTipText("Salir"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProductoServicio";
		inputMap = this.jButtonNuevoTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProductoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProductoServicio"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProductoServicio";
		inputMap = this.jButtonDuplicarTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProductoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProductoServicio"));
		
		//COPIAR
		sMapKey = "CopiarTipoProductoServicio";
		inputMap = this.jButtonCopiarTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProductoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProductoServicio"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProductoServicio";
		inputMap = this.jButtonVerFormTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProductoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProductoServicio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProductoServicio";
		inputMap = this.jButtonNuevoRelacionesTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProductoServicio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProductoServicio";
		inputMap = this.jButtonModificarTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProductoServicio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProductoServicio";
		inputMap = this.jButtonCerrarTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProductoServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProductoServicio";
		inputMap = this.jButtonGuardarCambiosTablaTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProductoServicio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProductoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProductoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProductoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProductoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProductoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProductoServicio.setName("jPanelParametrosReportesTipoProductoServicio"); 
		
		this.jPanelParametrosReportesAccionesTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProductoServicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProductoServicio.setName("jPanelParametrosReportesAccionesTipoProductoServicio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProductoServicio = new JButtonMe();
		this.jButtonRecargarInformacionTipoProductoServicio.setText("Recargar");
		this.jButtonRecargarInformacionTipoProductoServicio.setToolTipText("Recargar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProductoServicio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProductoServicio = new JButtonMe();
		this.jButtonProcesarInformacionTipoProductoServicio.setText("Procesar");
		this.jButtonProcesarInformacionTipoProductoServicio.setToolTipText("Procesar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProductoServicio.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProductoServicio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProductoServicio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProductoServicio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProductoServicio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProductoServicio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProductoServicio.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProductoServicio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProductoServicio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProductoServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProductoServicio.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProductoServicio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProductoServicio.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProductoServicio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProductoServicio.setText("Accion");
		this.jComboBoxTiposAccionesTipoProductoServicio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProductoServicio.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProductoServicio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProductoServicio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProductoServicio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProductoServicio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProductoServicio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProductoServicio = new JLabelMe();
		
		this.jLabelAccionesTipoProductoServicio.setText("Acciones");		
		this.jLabelAccionesTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProductoServicio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProductoServicio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProductoServicio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProductoServicio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProductoServicio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProductoServicio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProductoServicio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProductoServicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProductoServicio.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProductoServicio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProductoServicio = new JButtonMe();
		//this.jButtonAnterioresTipoProductoServicio.setText("<<");
        this.jButtonAnterioresTipoProductoServicio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProductoServicio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProductoServicio = new JButtonMe();
		//this.jButtonSiguientesTipoProductoServicio.setText(">>");
        this.jButtonSiguientesTipoProductoServicio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProductoServicio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProductoServicio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProductoServicio.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProductoServicio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProductoServicio,"nuevoguardarcambios_button","Nue",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProductoServicio";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProductoServicio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProductoServicio";
		inputMap = this.jButtonRecargarInformacionTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProductoServicio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProductoServicio";
		inputMap = this.jButtonSiguientesTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProductoServicio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProductoServicio";
		inputMap = this.jButtonAnterioresTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProductoServicio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProductoServicio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProductoServicio.setMinimumSize(new Dimension(this.getWidth(),TipoProductoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProductoServicio.setMaximumSize(new Dimension(this.getWidth(),TipoProductoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProductoServicio.setPreferredSize(new Dimension(this.getWidth(),TipoProductoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProductoServicio = new GridBagLayout();

			this.jPanelPaginacionTipoProductoServicio.setLayout(gridaBagLayoutPaginacionTipoProductoServicio);						
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = 0;
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProductoServicio.add(this.jButtonAnterioresTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
					
						
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProductoServicio.gridy = 0;
			
			this.jPanelPaginacionTipoProductoServicio.add(this.jButtonNuevoGuardarCambiosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
						
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProductoServicio.gridy = 0;
			this.jPanelPaginacionTipoProductoServicio.add(this.jButtonSiguientesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = 1;
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProductoServicio.add(this.jButtonNuevoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
				this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProductoServicio.gridy = 1;
				this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoProductoServicio.add(this.jButtonNuevoRelacionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			}
			
			
			if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
				this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProductoServicio.gridy = 1;
				this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProductoServicio.add(this.jButtonGuardarCambiosTablaTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			}
			
			
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = 1;
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProductoServicio.add(this.jButtonDuplicarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = 1;
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProductoServicio.add(this.jButtonCopiarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = 1;
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProductoServicio.add(this.jButtonVerFormTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = 1;
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProductoServicio.add(this.jButtonCerrarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
		
		
		this.jButtonRecargarInformacionTipoProductoServicio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProductoServicio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProductoServicio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProductoServicio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProductoServicio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProductoServicio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProductoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProductoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProductoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProductoServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProductoServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProductoServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProductoServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProductoServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProductoServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProductoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProductoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProductoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProductoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProductoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProductoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProductoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProductoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProductoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProductoServicio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProductoServicio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProductoServicio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProductoServicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProductoServicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProductoServicio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProductoServicio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProductoServicio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProductoServicio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProductoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProductoServicio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProductoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProductoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProductoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProductoServicio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProductoServicio.setLayout(gridaBagParametrosReportesTipoProductoServicio);
			this.jPanelParametrosReportesAccionesTipoProductoServicio.setLayout(gridaBagParametrosReportesAccionesTipoProductoServicio);
			
			
			this.jPanelParametrosAuxiliar1TipoProductoServicio.setLayout(gridaBagParametrosAuxiliar1TipoProductoServicio);
			this.jPanelParametrosAuxiliar2TipoProductoServicio.setLayout(gridaBagParametrosAuxiliar2TipoProductoServicio);
			this.jPanelParametrosAuxiliar3TipoProductoServicio.setLayout(gridaBagParametrosAuxiliar3TipoProductoServicio);
			this.jPanelParametrosAuxiliar4TipoProductoServicio.setLayout(gridaBagParametrosAuxiliar4TipoProductoServicio);
			//this.jPanelParametrosAuxiliar5TipoProductoServicio.setLayout(gridaBagParametrosAuxiliar2TipoProductoServicio);			
			
			
			
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jButtonRecargarInformacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProductoServicio.add(this.jComboBoxTiposPaginacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProductoServicio.add(this.jCheckBoxConAltoMaximoTablaTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProductoServicio.add(this.jComboBoxTiposArchivosReportesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jPanelParametrosAuxiliar1TipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProductoServicio.add(this.jComboBoxTiposReportesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jPanelParametrosAuxiliar4TipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jComboBoxTiposReportesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jCheckBoxGenerarReporteTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jPanelParametrosAuxiliar2TipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jLabelAccionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
				this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProductoServicio.add(this.jButtonAbrirOrderByTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jComboBoxTiposSeleccionarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);			
			
			
			/*
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jCheckBoxSeleccionarTodosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProductoServicio.add(this.jCheckBoxSeleccionarTodosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);															
				
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProductoServicio.add(this.jCheckBoxSeleccionadosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jPanelParametrosAuxiliar3TipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jComboBoxTiposRelacionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
				
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProductoServicio.add(this.jComboBoxTiposAccionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProductoServicio = new GridBagLayout();

			this.jScrollPanelDatosTipoProductoServicio.setLayout(gridaBagLayoutDatosTipoProductoServicio);
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = 0;
			this.gridBagConstraintsTipoProductoServicio.gridx = 0;
			
			this.jScrollPanelDatosTipoProductoServicio.add(this.jTableDatosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProductoServicio.setViewportView(this.jTableDatosTipoProductoServicio);
		this.jTableDatosTipoProductoServicio.setFillsViewportHeight(true);
		this.jTableDatosTipoProductoServicio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProductoServicio= new GridBagLayout();
		this.jPanelAccionesTipoProductoServicio.setLayout(gridaBagLayoutAccionesTipoProductoServicio);
		
		
		/*	
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = 0;
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;
			
		this.jPanelAccionesTipoProductoServicio.add(this.jButtonNuevoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoProductoServicio= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoProductoServicio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoProductoServicio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoProductoServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoProductoServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoProductoServicio.setLayout(gridaBagLayoutBusquedaPorNombreTipoProductoServicio);

		gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProductoServicio.gridy = 0;
		gridBagConstraintsTipoProductoServicio.gridx = 0;
		jPanelBusquedaPorNombreTipoProductoServicio.add(jLabelnombreBusquedaPorNombreTipoProductoServicio, gridBagConstraintsTipoProductoServicio);

		gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProductoServicio.gridy = 0;
		gridBagConstraintsTipoProductoServicio.gridx = 1;
		jPanelBusquedaPorNombreTipoProductoServicio.add(jTextAreanombreBusquedaPorNombreTipoProductoServicio, gridBagConstraintsTipoProductoServicio);

		gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProductoServicio.gridy = 1;
		gridBagConstraintsTipoProductoServicio.gridx =1;
		jPanelBusquedaPorNombreTipoProductoServicio.add(jButtonBusquedaPorNombreTipoProductoServicio, gridBagConstraintsTipoProductoServicio);

		jTabbedPaneBusquedasTipoProductoServicio.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoProductoServicio);
		jTabbedPaneBusquedasTipoProductoServicio.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProductoServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProductoServicio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();						
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProductoServicio.gridx = 0;		
			//this.gridBagConstraintsTipoProductoServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProductoServicio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;		
		//this.gridBagConstraintsTipoProductoServicio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProductoServicio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProductoServicio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProductoServicio.gridx = 0;		
			this.gridBagConstraintsTipoProductoServicio.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoProductoServicio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);								
		
		
		/*
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		*/		
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProductoServicio.gridx =0;
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProductoServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
				
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProductoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProductoServicio = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProductoServicio.setLayout(gridaBagLayoutBusquedasParametrosTipoProductoServicio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProductoServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProductoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProductoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProductoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			
			
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
			
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProductoServicio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProductoServicio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProductoServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProductoServicio.setName("jPanelReporteDinamicoTipoProductoServicio"); 
		
		this.jPanelReporteDinamicoTipoProductoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProductoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProductoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProductoServicio.setLayout(gridaBagLayoutReporteDinamicoTipoProductoServicio);
		
		
		this.jInternalFrameReporteDinamicoTipoProductoServicio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProductoServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProductoServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProductoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProductoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProductoServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProductoServicio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProductoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProductoServicio.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProductoServicio.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProductoServicio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProductoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProductoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProductoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProductoServicio = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProductoServicio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jLabelColumnasSelectReporteTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProductoServicio = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProductoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProductoServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProductoServicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProductoServicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProductoServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProductoServicio=new JScrollPane(this.jListColumnasSelectReporteTipoProductoServicio);
			
			this.jScrollColumnasSelectReporteTipoProductoServicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProductoServicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProductoServicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProductoServicio.add(this.jListColumnasSelectReporteTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jScrollColumnasSelectReporteTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProductoServicio = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProductoServicio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jLabelRelacionesSelectReporteTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProductoServicio = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProductoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProductoServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProductoServicio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProductoServicio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProductoServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProductoServicio=new JScrollPane(this.jListRelacionesSelectReporteTipoProductoServicio);
			
			this.jScrollRelacionesSelectReporteTipoProductoServicio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProductoServicio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProductoServicio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProductoServicio.add(this.jListRelacionesSelectReporteTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jScrollRelacionesSelectReporteTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoProductoServicio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProductoServicio = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProductoServicio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProductoServicio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProductoServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProductoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProductoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProductoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jLabelGenerarExcelReporteDinamicoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProductoServicio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProductoServicio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProductoServicio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProductoServicio.setToolTipText("Generar EXCEL"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		//this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProductoServicio.add(this.jButtonGenerarExcelReporteDinamicoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jComboBoxTiposReportesDinamicoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jLabelTiposArchivoReporteDinamicoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProductoServicio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProductoServicio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProductoServicio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProductoServicio.setToolTipText("Generar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jButtonGenerarReporteDinamicoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProductoServicio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProductoServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProductoServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProductoServicio.setToolTipText("Cancelar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProductoServicio.add(this.jButtonCerrarReporteDinamicoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProductoServicio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProductoServicio= new JScrollPane(jPanelReporteDinamicoTipoProductoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProductoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProductoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProductoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProductoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProductoServicio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProductoServicio);
		this.jInternalFrameReporteDinamicoTipoProductoServicio.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProductoServicio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProductoServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProductoServicio.setName("jPanelImportacionTipoProductoServicio"); 
		
		this.jPanelImportacionTipoProductoServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProductoServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProductoServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProductoServicio.setLayout(gridaBagLayoutImportacionTipoProductoServicio);
		
		
		this.jInternalFrameImportacionTipoProductoServicio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProductoServicio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProductoServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProductoServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProductoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProductoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProductoServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProductoServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProductoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProductoServicio.setResizable(true);
	    this.jInternalFrameImportacionTipoProductoServicio.setClosable(true);
	    this.jInternalFrameImportacionTipoProductoServicio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProductoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProductoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProductoServicio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProductoServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProductoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProductoServicio.setResizable(true);
	    this.jInternalFrameImportacionTipoProductoServicio.setClosable(true);
	    this.jInternalFrameImportacionTipoProductoServicio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProductoServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProductoServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProductoServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProductoServicio = new JLabelMe();

		this.jLabelArchivoImportacionTipoProductoServicio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProductoServicio.add(this.jLabelArchivoImportacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProductoServicio = new JFileChooser();		
		this.jFileChooserImportacionTipoProductoServicio.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProductoServicio = new JButtonMe();
		this.jButtonAbrirImportacionTipoProductoServicio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProductoServicio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProductoServicio.setToolTipText("Generar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProductoServicio.add(this.jButtonAbrirImportacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProductoServicio = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProductoServicio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProductoServicio.add(this.jLabelPathArchivoImportacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProductoServicio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProductoServicio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProductoServicio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProductoServicio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProductoServicio.add(this.jTextFieldPathArchivoImportacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProductoServicio = new JButtonMe();
		this.jButtonGenerarImportacionTipoProductoServicio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProductoServicio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProductoServicio.setToolTipText("Generar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProductoServicio.add(this.jButtonGenerarImportacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProductoServicio = new JButtonMe();
		this.jButtonCerrarImportacionTipoProductoServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProductoServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProductoServicio.setToolTipText("Cancelar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProductoServicio.add(this.jButtonCerrarImportacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProductoServicio = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProductoServicio= new JScrollPane(jPanelImportacionTipoProductoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicio.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProductoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProductoServicio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProductoServicio);
		this.jInternalFrameImportacionTipoProductoServicio.getContentPane().add(this.jScrollPanelImportacionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProductoServicio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProductoServicio = new JButtonMe();
			this.jButtonAbrirOrderByTipoProductoServicio.setText("Orden");
			this.jButtonAbrirOrderByTipoProductoServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProductoServicio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProductoServicio";
			inputMap = this.jButtonAbrirOrderByTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProductoServicio"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProductoServicio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProductoServicio.setName("jPanelOrderByTipoProductoServicio"); 
			
			this.jPanelOrderByTipoProductoServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProductoServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProductoServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProductoServicio.setLayout(gridaBagLayoutOrderByTipoProductoServicio);
			
			
			this.jTableDatosTipoProductoServicioOrderBy = new JTableMe();        
			this.jTableDatosTipoProductoServicioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProductoServicioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProductoServicioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProductoServicioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProductoServicioOrderBy.setViewportView(this.jTableDatosTipoProductoServicioOrderBy);
			this.jTableDatosTipoProductoServicioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProductoServicioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProductoServicio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProductoServicio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProductoServicio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProductoServicio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProductoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProductoServicio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProductoServicio.setTitle("Orden");
			this.jInternalFrameOrderByTipoProductoServicio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProductoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProductoServicio.setResizable(true);
			this.jInternalFrameOrderByTipoProductoServicio.setClosable(true);
			this.jInternalFrameOrderByTipoProductoServicio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProductoServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProductoServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProductoServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProductoServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProductoServicio.ipady =150;
				
			this.jPanelOrderByTipoProductoServicio.add(jScrollPanelDatosTipoProductoServicioOrderBy, this.gridBagConstraintsTipoProductoServicio);//this.jTableDatosTipoProductoServicioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProductoServicio = new JButtonMe();
			this.jButtonCerrarOrderByTipoProductoServicio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProductoServicio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProductoServicio.setToolTipText("Cancelar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProductoServicio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProductoServicio.add(this.jButtonCerrarOrderByTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProductoServicio = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProductoServicio= new JScrollPane(jPanelOrderByTipoProductoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProductoServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProductoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProductoServicio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProductoServicio);
			
			this.jInternalFrameOrderByTipoProductoServicio.getContentPane().add(this.jScrollPanelOrderByTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);			
		
		} else {
			this.jButtonAbrirOrderByTipoProductoServicio = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoproductoservicioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProductoServicio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProductoServicio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProductoServicio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProductoServicio.getRowHeight();//TipoProductoServicioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProductoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProductoServicio.isSelected()) {
					iHeightTable=TipoProductoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProductoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProductoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProductoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProductoServicio.isSelected()) {
					iHeightTable=TipoProductoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProductoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProductoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProductoServicio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProductoServicio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProductoServicio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProductoServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProductoServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProductoServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProductoServicio!=null && this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProductoServicio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProductoServicio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProductoServicio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProductoServicio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProductoServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProductoServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProductoServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoproductoservicioLogic.getTipoProductoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductoservicios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProductoServicio> TraerTipoProductoServicioBeans(List<TipoProductoServicio> tipoproductoservicios,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProductoServicio tipoproductoservicio:tipoproductoservicios) {
					
				if(!(TipoProductoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProductoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoproductoservicio.setsDetalleGeneralEntityReporte(TipoProductoServicioConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicio));
										
						
					
					

					if(tipoproductoservicio.getCuentaContableTipos()!=null && Funciones.existeClass(classes,CuentaContableTipo.class)) {
						try{tipoproductoservicio.setcuentacontabletiposDescripcionReporte(new JRBeanCollectionDataSource(CuentaContableTipoJInternalFrame.TraerCuentaContableTipoBeans(tipoproductoservicio.getCuentaContableTipos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproductoservicio.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{tipoproductoservicio.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(tipoproductoservicio.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoproductoservicio.setsDetalleGeneralEntityReporte(tipoproductoservicio.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoproductoserviciobeans.add(tipoproductoserviciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoproductoservicios;
    }
	//PARA REPORTES FIN
}
